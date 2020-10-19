package Lec_01_Introduction_to_Java;

import java.util.Scanner;

public class I_CheckEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int even =0;
		int odd = 0;
		
		
		Scanner sc = new Scanner(System.in);
		
		int numberArray[] = new int[10];
		
		for(int i = 0;i < 10;i++) {
			System.out.println("Enter "+(i+1)+" Number:");
			numberArray[i] = sc.nextInt();
		}

		
		for(int i = 0;i < 10;i++) {
			
			int answer = numberArray[i] % 2; 
			
			if(answer == 0)
				even++;
			else
				odd++;
			
		}
		
		System.out.println("Even Number Count is "+even);
		System.out.println("Odd Number Count is "+odd);
		
		
	}

}
