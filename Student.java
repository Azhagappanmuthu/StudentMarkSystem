package com.studentmark;

import java.util.List;


// Student Class
public class Student {
	
	String name;
	int id;
	List<Subject>subjectList;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Subject> getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(List<Subject> subjectList) {
		this.subjectList = subjectList;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", subjectList=" + subjectList + "]";
	}
	

	
	
	
	

}
