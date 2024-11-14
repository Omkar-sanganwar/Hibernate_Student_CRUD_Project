package com.nov14;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students", schema = "advjava193")
public class Student {

	@Id
	private int roll_No;
	private String name;
	private int marks;

	public Student() {
		super();
	}

	public Student(int rollNo, String name, int marks) {
		super();
		this.roll_No = rollNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRollNo() {
		return roll_No;
	}

	public void setRollNo(int rollNo) {
		this.roll_No = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + roll_No + ", name=" + name + ", marks=" + marks + "]";
	}
}
