package Lec_01_Introduction_to_Java;

import java.util.Scanner;

public class H_Exercise03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 numbers:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		
		if(n1 > n2) {
			
				if(n1 > n3)
					System.out.println("Largest number is Number 1 = "+n1);
				else
					System.out.println("Largest number is Number 3 = "+n3);
		}else {
			
				if(n2 > n3)
					System.out.println("Largest number is Number 2 = "+n2);
				else
					System.out.println("Largest number is Number 3 = "+n3);
		}
		
		

	}

}
