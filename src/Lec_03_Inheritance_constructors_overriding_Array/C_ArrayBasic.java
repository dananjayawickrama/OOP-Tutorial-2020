/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec_03_Inheritance_constructors_overriding_Array;

import java.util.Scanner;

/**
 *
 * @author Dananjaya
 */
public class C_ArrayBasic {
      public static void main(String args[]){
          
          //declare a array
          int[] numbers;
          String names[] = {"Dananjaya","Wickrama"};
          char letters[] = {'A','C','d','e','p'};
          
          //print array
          System.out.println("Names array 1st index is = "+names[1]);
          
          for(int i =0;i < 5;i++){
              System.out.println("Letters "+i+"element is "+letters[i]);
          }
          
          System.out.println("\n\n");
          
          
          //Allocating Memory
          
          Scanner sc = new Scanner(System.in);
          
          int no[] = new int[4];
          
          for(int r = 0;r < 4;r++){
              
          System.out.println("Enter numbers:");
          no[r] = sc.nextInt();
          }
          
          //display No array
          
          for(int y = 0;y < 4;y++){
              System.out.println("No array "+y+" index is = "+no[y]);
          }
          
          
          
          
          
      }
    
}
