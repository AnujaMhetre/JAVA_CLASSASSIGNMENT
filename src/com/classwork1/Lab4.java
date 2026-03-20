package com.classwork1;

import java.lang.reflect.Array;
import java.util.Arrays;

class Employe implements Comparable<Employe> {
	String name;
	String dept;
	int id;
	double salary;
	
	public Employe(String name,String dept,int id,double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.dept=dept;
				
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" , "+dept+ " , "+id+" , "+salary;
	}
	
	public int compareTo(Employe e) {
		return this.id-e.id;

	}
		
}
public class Lab4 {
	
	
	
	
	public static void main(String[] args) {
		Employe[]arr= new Employe[5];
		arr[0]=new Employe("anu","clerk",77,2080);
		arr[1]=new Employe("sanu","clerk",22,2000);
		arr[2]=new Employe("ranu","associte",20,2040);
		arr[3]=new Employe("manu","teacher",3,2030);
		arr[4]=new Employe("vanu","ceo",5,200);
		
		System.out.println("Before sorting: ");
		display(arr);
		System.out.println("After sorting by empid using Comparable: ");
		Arrays.sort(arr);
		display(arr);
		
		
		
		
	}

	public static void display(Employe[]arr) {
		for(Employe e:arr) {
			System.out.println(e);
			}
		}
	
	

}
