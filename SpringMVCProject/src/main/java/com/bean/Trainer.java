package com.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Trainer")
public class Trainer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "subject")
	private String subject;
	@Column(name = "salary")
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", subject=" + subject + ", salary=" + salary + "]";
	}
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
  
}
