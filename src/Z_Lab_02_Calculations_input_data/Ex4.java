/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_Lab_02_Calculations_input_data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Dananjaya
 */
public class Ex4 {
      public static void main(String args[]) throws IOException{
          
          
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          System.out.println("Enter Length,width and height: ");
          String le = br.readLine();
          String wi = br.readLine();
          String he = br.readLine();
          
          double l = Double.parseDouble(le);
          double w = Double.parseDouble(wi);
          double h = Double.parseDouble(he);
          
          System.out.println("Volume is = "+(l*w*h));
          
      }
    
}
