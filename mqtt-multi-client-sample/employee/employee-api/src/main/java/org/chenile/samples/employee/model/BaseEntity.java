package org.chenile.samples.employee.model;

import jakarta.persistence.*;

import java.util.UUID;

@MappedSuperclass
public class BaseEntity {

    @Id @Column(name = "id") public String id;
    public String tenant;
    public String createdBy;
    @Version  public int version;
    @PrePersist
    @PreUpdate
    void setIdIfMissing() {
        if (id == null) {
            id = UUID.randomUUID().toString();
        }
    }
}
