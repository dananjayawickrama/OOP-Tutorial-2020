
package Z_Lab_05_Abstract_classes_interfaces_Part_01;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Z_MainEX4 {
    
  public static void main(String[] args) {

      int maxSubjects;
      int[] marks = new int[5];
      int total = 0;
      double avg;
      
      try {
          
          
      // 1. Input a value for maxSubjects from keyboard
      
      Scanner sc = new Scanner(System.in);
      
          System.out.println("Enter maxSubjects: ");
          maxSubjects = sc.nextInt();

      // 2. Using a for loop  input marks 
         
      for(int i = 0;i < maxSubjects;i++){
          
          System.out.println("Enter mark "+(i+1)+" : ");
          marks[i] = sc.nextInt();
          total = total + marks[i];
      }
      
      // 3. Calculate the avg marks
      
      
          
          avg = total / maxSubjects;

      
      System.out.println("\nAverage is = "+avg);

      
      } catch (ArithmeticException e) {
          
	System.out.println("Maximum number of subjects should be greater than 0");
		
      } catch (ArrayIndexOutOfBoundsException e) {
			
          System.out.println("Maximum number of subjects should less than 6");
		
      } catch (InputMismatchException e) {
			
          System.out.println("Please enter a valid number for Maximum number of subjects");
		
      }finally {
			
          System.out.println("This code will be guaranteed to run");
		
      }
		
      
      System.out.println("The end");
	
  
  }

}
