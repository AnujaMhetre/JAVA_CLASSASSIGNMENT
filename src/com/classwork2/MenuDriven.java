package com.classwork2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


class Employee implements Comparable<Employee>{
	String name;
	int id;
	double salary;
	public Employee(String n,int i,double s) {
		this.name=n;
		this.id=i;
		this.salary=s;
	}
	@Override
	public String toString() {
		return name+" "+id+" "+salary;
	}
	public int compareTo(Employee e) {
		return this.id-e.id;
	}
	
}
public class MenuDriven {
	 ArrayList<Employee>emplist=new ArrayList<>();
	 emplist.add(new Employee("anuja",2,2000));

	public static void main(String[] args) {
		MenuDriven m= new MenuDriven();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("*******Welcome to menu********");
			System.out.println("1. Add an Employee\r\n"
					+ "2. display all emps\r\n"
					+ "3. dispay emps on id in asc order\r\n"
					+ "4. display emps on name in desc order\r\n"
					+ "5. display emps on sal in desc order");
			System.out.println("6. Exit");
		
			
			
		System.out.println("enter your choice");
		choice=sc.nextInt();
		switch(choice){
		case 1:
			m.addEmployee(sc);
			break;
		case 2:
			m.displayEmployees();
			break;
		case 3:
			m.orderById();
			break;
		case 4:
			m.orderByName();
			break;
			
		case 5:	
			m.orderByName();
			break;
		default:
			System.out.println("Invalid choice plz enter between 5");
		}
		}while(choice != 6);
		
		sc.close();	
	 
		

	}
	
	public void addEmployee(Scanner sc) {
		System.out.println("enter name of employee ");
		String name=sc.nextLine();
		sc.next();
		System.out.println("enter id of employee ");
		int id= sc.nextInt();
		sc.next();
		System.out.println("enter salary of employee ");
		Double salary=sc.nextDouble();
		System.out.println(emplist.add(new Employee(name,id,salary)));
		
		
	}
	
	public void displayEmployees() {
		for(Employee e:emplist) {
			System.out.println(e);
		}
	}
	
	public void orderById() {
		Collections.sort(emplist);
	}
	
	public void orderByName() {
		
	}

}
