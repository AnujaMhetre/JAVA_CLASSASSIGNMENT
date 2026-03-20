package com.classwork;

public class show2 {
	
	public void checkMultiConstructor() {
		
	}
	public show2() {
		System.out.println("this is inside nonparameterized constructor");
		
	}
	public show2(int a,int b) {
		System.out.println("this is inside 2 parameterized constructor");
	}
	public show2(int a, int b, int c) {
		System.out.println("this is inside 3 parameterized constructor");
		
	}
	public static void main(String[]args) {
		show2 s= new show2();
	
		show2 s1= new show2(3,4);
		show2 s2= new show2(2,3,4);
		
	}

}
