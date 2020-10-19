package Lec_01_Introduction_to_Java;

import java.util.Scanner;

public class D_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Plz Enter Number:");
		int no = sc.nextInt();
		
		System.out.println("Plz Enter Salary:");
		double sal = sc.nextDouble();
		
		System.out.println("Plz Enter rate:");
		float rate = sc.nextFloat();
		
		System.out.println("Plz Enter Name:");
		String name = sc.next();
		
		System.out.println("Plz Enter Letter:");
		char letter = sc.next().charAt(0);
		
		System.out.println("Plz enter True or False:");
		boolean mycon = sc.nextBoolean();
		
		
		System.out.println("Number is "+no);
		System.out.println("Salary is "+sal);
		System.out.println("rate is "+rate);
		System.out.println("Name is "+name);
		System.out.println("Letter is "+letter);
		System.out.println("Condition is "+mycon);
	}

}
