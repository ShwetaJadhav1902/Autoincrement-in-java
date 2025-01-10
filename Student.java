package com.autoincrement1;

public class Student {
	private static int studId;
	private String studName;
	private int studAge;

	public Student(String studName,int studSal) {
		studId++;
		this.studName=studName;
		this.studAge=studAge;
	}
	public static int getStudId() {
		return studId;
	}
	public String getStudName() {
		return studName;
	}
	public int getStudAge() {
		return studAge;
	}

}
