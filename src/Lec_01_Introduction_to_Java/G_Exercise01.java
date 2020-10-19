package Lec_01_Introduction_to_Java;

import java.util.Scanner;

public class G_Exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter length and width:");
		double l = sc.nextDouble();
		double w = sc.nextDouble();
		
		double perimeter = 2 *(l + w);
		
		System.out.println("perimeter is = "+perimeter);

	}

}
