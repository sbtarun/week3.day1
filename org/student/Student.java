package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student name is Tarun");
	}

	public void studentDept() {
		System.out.println("Department is Computer Applications");
	}

	public void studentId() {
		System.out.println("Student ID is 50");
	}

	public static void main(String[] args) {
		Student obj = new Student();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		obj.deptName();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}
}
