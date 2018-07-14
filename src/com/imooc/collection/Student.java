package com.imooc.collection;

import java.util.HashSet;
import java.util.Set;

public class Student {

	private String id;
	private String name;
	public Set<Course> courses;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(String id, String name) {
		setId(id);
		setName(name);
		this.courses = new HashSet<Course>();
	}
}
