package org.project;

public class Variables {
	int c, e;

	public void Variables(int a,int b) {
		
		c=a+b;
		System.out.println("c=" +(a+b));
	}
	
		public void Variables1(int d) {
			e=c+d;
			System.out.println("Sum value e="+(c+d));
		}
		
		
	
	
	public static void main(String[] args ) {
		
		Variables v=new Variables();
		v.Variables(10, 20);
		v.Variables1(30);
		
		
	}
	
	
	}
