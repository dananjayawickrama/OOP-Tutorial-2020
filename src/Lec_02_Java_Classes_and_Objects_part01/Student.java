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
public class Student {
    
     
     public String name;
     public String batchName;
     public String batchNo;
     public String year;
             
     //default constructor
     public Student(){
         
    
     }    
     
     //overload constructor
     
     public Student(String batchName, String bNo){
         
         this.batchName = batchName;
         batchNo = bNo;
         year = "4th Year";
         
     }
         
     
     public void displayDetails(){
         
         System.out.println("Name is = "+name);
         System.out.println("Batch Name is = "+batchName);
         System.out.println("batch No is = "+batchNo);
         System.out.println("Year is = "+year);
         
     }
         
         
     
    
}
