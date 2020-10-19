/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_Lab_02_Calculations_input_data;

import java.util.Scanner;

/**
 *
 * @author Dananjaya
 */
public class Ex3 {
      public static void main(String args[]){
          
          
          Scanner sc = new Scanner(System.in);
          
          System.out.println("Plz input length,width and height:");
          double l = sc.nextDouble();
          double w = sc.nextDouble();
          double h = sc.nextDouble();
          
          double volume = l * w * h;
          System.out.println("Volume is "+volume);
          
          
          
          
      }
    
}
