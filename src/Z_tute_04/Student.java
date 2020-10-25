/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_tute_04;

import java.util.Scanner;

/**
 *
 * @author Dananjaya
 */
public class Student implements IDisplay,IInput{
    
    
    private String studentID,name;
    
    public void print(){
        
        System.out.println("studentID Id is = "+studentID);
        System.out.println("Student name is = "+name);
        
        
    }
    
   public void printDetails(){
       
        System.out.println("studentID Id is = "+studentID);
        System.out.println("Student name is = "+name);
        
       
   }
    
    public void input(){
        
          Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter Student Id,Name :");
         studentID = sc.next();
         name = sc.next();
         
        
    }
}
