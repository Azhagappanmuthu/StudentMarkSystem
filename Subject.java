package com.studentmark;

public class Subject {
	
	String name;
	int mark;
	int total;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Subject [name=" + name + ", mark=" + mark + ", total=" + total + "]";
	}
	
	

}
