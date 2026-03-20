package com.classwork;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class student<T>{
	
	public int menu(Scanner sc) {
		
		System.out.println("0. exit");
		System.out.println("1. Display all student");
		System.out.println("find student on roll number");
		System.out.println("delete the student by given roll number");
		System.out.println("5. display all students sorted on roll no in asc order");
		System.out.println("6. display all students sorted on name in asc order");
		System.out.println("7. display all students sorted on marks in desc order");
		System.out.println("8. display student marks and their percentange ");
		
				
		System.out.println("Enter your choice");
		return sc.nextInt();
		
	}
}


public class menudriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		student s1= new student();
		
		List<String> s= new ArrayList<>();
		s.add("rutuja");
		s.add("Sneha");
		s.add("gita");
		s.add("seeta");
		s.add("meena");
		
		int counter=0;
		int choice1;
		
		while (choice1=menu(sc)!=0) {
			
			switch(choice1){
				
			case 1:
				s.add("Rani");
			
				
			case 2:	
				for(int i=0;i<s.size();i++) {
					System.out.println();
				}
			}
			
		}
		
		
		

	}

}
