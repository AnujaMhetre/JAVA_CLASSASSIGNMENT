package com.classwork;

public class pattern {
	
	public void pascalsTriangle() {
		
		for(int i=0;i<=5;i++) {
			System.out.println("");
			for(int j=0;j<=i;j++) {
				System.out.print(" * ");
			}
		}
	}
	public void pyramid(){
		for(int i=0;i<5;i++) {
			for (int j=0;j<5;j--) {
				System.out.print("  ");
			
			
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pattern p= new pattern() ;
		p.pascalsTriangle();

	}

}
