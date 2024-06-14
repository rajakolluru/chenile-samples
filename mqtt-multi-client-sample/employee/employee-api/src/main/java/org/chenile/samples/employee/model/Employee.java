package org.chenile.samples.employee.model;

import jakarta.persistence.*;

import java.io.Serializable;


 @Entity
 @Table(name = "employee")
 public class Employee extends BaseEntity implements Serializable  {
	// Define the model attributes here
	public String firstName;
	public String lastName;
	public String email;
}
