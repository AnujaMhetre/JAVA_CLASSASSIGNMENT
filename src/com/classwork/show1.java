package com.classwork;



//java for loop

public class show1 {
	
	public void whileloop() {
		
		int b=1;
			
		while(b<9) {
			System.out.println(b);
			b++;
		}

		
	}
	public void forloop() {
		
			int a[]= {1,2,3,4,5,6,7};
			
			for (int i=0;i<=a.length;i++) {
				System.out.println(a[i]);
			}
		
	}
	public void doWhileLoop() {
		int c=0;
		do {
			System.out.println(c);
			c++;
		}while(c<10) ;
			
		
	
	}
	


	public static void main(String[] args) {
		show1 s= new show1();
		s.doWhileLoop();
		s.whileloop();
		s.forloop();
		
	}	
	
	}


