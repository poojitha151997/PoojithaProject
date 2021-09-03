package org.acc;

public class Access {

	private void test() {
		System.out.println("test the result");
		}
	
	 void qa() {
		System.out.println("qa is positive");
	}
	 
	 protected void car() {
		 System.out.println("New car");
	 }
	 
	 public void value() {
		 System.out.println("Value is null");
	 }
	
	public static void main(String[] args) {
		
		Access a=new Access();
		a.car();
		a.qa();
		a.test();
		a.value();
	}
}
