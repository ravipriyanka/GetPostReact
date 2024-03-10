package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
@Id	
	int id;
	
public Student(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
	public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	String name;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}

