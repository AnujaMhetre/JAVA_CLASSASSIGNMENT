package com.classwork;
class shape{
	
}
class shape2D extends shape{ 
	
	public double circle(int r) {
		return 3.14*r*r;
	}
	
}
class shape3D extends shape{
	public double rectangle(int l,int b) {
		return l*b;
	}
	
}
class shape4D extends shape{
	public String sphere(String  a) {
		return a;
	}
	
}
class shape5D extends shape{
	public double cube(int l,int b, int h) {
		return l*b*h;
	}
}

public class show4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape2D s= new shape2D ();
		shape3D s1= new shape3D ();
		shape5D s2= new shape5D ();
		System.out.println(s.circle(2));
		System.out.println(s1.rectangle(2, 3));
		System.out.println(s2.cube(2, 4, 6));
		

	}

}
