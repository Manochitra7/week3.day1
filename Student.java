package org.student;

import org.department.Department;

public class Student extends Department {

public void studentName() {
	System.out.println("Student Name");
	
}
public void studentDept() {
	System.out.println("Student Department");
}

public void studentId() {
	System.out.println("Student id");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student details = new Student();
details.collegeName();;
details.collegeCode();
details.collegeRank();
details.studentDept();
details.studentId();
details.studentName();

	}

}
