package org.chenile.samples.issue.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;

@Entity
@Table(name = "issue")
public class Issue extends BaseEntity{
	@Serial
	private static final long serialVersionUID = 1L;
	public String assignee;
	public String assignComment;
	public String closeComment;
	public String resolveComment;
	public String description;
	public String openedBy;
}
