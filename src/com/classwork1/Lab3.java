package com.classwork1;



class Time{
	
	String time;
	public Time(String t) {
		this.time =t;
	}
		public void display() {
			System.out.println("the time is "+time);
	}
	
	
}
class Employ{
	String name;
	int id;
	public Employ(String n,int i) {
		this.name=n;
		this.id=i;
	}
	public void display() {
		System.err.println("the name is "+name+" id is "+id);
	}
	public String toString() {
		return name+" "+id;
	}
	
}
public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time t1= new Time("12:15");
		Time t2= new Time("12:15");
		
		Employ e1= new Employ("Anuja",12);
		Employ e2= new Employ("Anuja",12);
		
		System.out.println(e1.equals(e2));
		System.out.println(t1.equals(t2));
		
		System.out.println(e1==e2);
		System.out.println(t1==t2);
		
		System.out.println(t1);
		System.out.println(e2);
		

	}

}
