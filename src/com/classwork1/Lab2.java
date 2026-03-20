package com.classwork1;

import java.util.Scanner;

class StudentArray{
	Scanner sc=new Scanner(System.in);
	String[]Student=new String[5];
	
	public void accept() {
		System.err.println("enter array values: ");
		for(int i=0;i<Student.length;i++) {
			Student[i]=sc.next();
			
		}
		
	}
	public void display() {
		System.out.println("the name of students are : ");
		for(int i=0;i<Student.length;i++) {
			System.out.println(Student[i]);
			
		}
	}
}
class EmployeeArray{
	Scanner sc=new Scanner(System.in);
	String[]Employee=new String[5];
	public void accept() {
		System.err.println("enter array values: ");
		for(int i=0;i<5;i++) {
			Employee[i]=sc.next();
		}
	}
	public void display() {
		System.out.println("the name of Employee are : ");
		for(int i=0;i<Employee.length;i++) {
			System.out.println(Employee[i]);
		}
	}
}
class Lab2{
	public static void main(String[]args) {
		
		StudentArray s= new StudentArray();
		EmployeeArray e= new EmployeeArray();
		s.accept();
		s.display();
		e.accept();e.display();
		
		
	}
}