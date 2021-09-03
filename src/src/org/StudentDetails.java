package src.org;

import java.util.Scanner;

public class StudentDetails {
	public void sample () {
		
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value");
		int a=s.nextInt();
		
		switch (a) {
		case 1: System.out.println("sunday");
		break;
		
		case 2: System.out.println("monday");
		break;
		
		case 3: System.out.println("tuesday");
		break;
		
		default: System.out.println("ENter the value");
		break;
		
		}
}
	
  }
