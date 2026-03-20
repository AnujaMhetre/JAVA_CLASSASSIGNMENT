package com.classwork1;

import java.util.Scanner;

class Student{
	String name;
	int id;
	
	public Student(String n, int i) {
		this.name=n;
		this.id=i;
	}
	
	public void setname(String n) {
		
	}
	public String getname() {
		return name;
	}
	public void setId(int id) {
		
	}
	public int getId() {
		return id;
	}
	public void display() {
		System.out.println("The name is "+name+"id is "+id);
	}
}
class Date{
	String date;
	
	public Date(String d) {
		this.date=d;
	}
	public void setDame(String d) {
		
	}
	public String getDame() {
		return date;
	}
	public void display() {
		System.out.println("The Date is "+date);
	}
	
}
class Employee extends Student{

	public Employee(String n, int i) {
		super(n, i);
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println("The name is "+name+"id is "+id);
	}
	
}
class Person extends Student{

	public Person(String n, int i) {
		super(n, i);
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println("The name is "+name+"id is "+id);
	}
	
}
public class lab1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Person p= new Person("ram",2);
		Student s=new Student("Anuja",1);
		Employee e= new Employee("Radha",5);
		Date d=new Date("05/12/2002");
		p.display();
		s.display();
		e.display();
		d.display();
				
		
	}

}
