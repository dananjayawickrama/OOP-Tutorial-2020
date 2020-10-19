/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec_02_Java_Classes_and_Objects_part01;

/**
 *
 * @author Dananjaya
 */
public class MainClass {
     public static void main(String args[]){
         
         
         Student sobj1 = new Student();
         sobj1.name = "Dananjaya";
         sobj1.batchName = "2nd year";
         sobj1.batchNo = "101";
         sobj1.year = "year 2";
         sobj1.displayDetails();
         
         //2nd Object
         System.out.println("\n");
         
         Student obj2 = new Student("4th year final", "404");
         obj2.name = "Wickrama";
         obj2.displayDetails();
         
         
     }
    
}
