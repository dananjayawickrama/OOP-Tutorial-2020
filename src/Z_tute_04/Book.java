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
public class Book implements IDisplay,IInput{
    
    private String bookID,title,publisher;
    
    
     public void input(){
         
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter Book Id,Title and Publisher:");
         bookID = sc.next();
         title = sc.next();
         publisher = sc.next();
        
    }
    
    public void print(){
        
        System.out.println("Book Id is = "+bookID);
        System.out.println("Book title is = "+title);
        System.out.println("Publisher is = "+publisher);
        
    }
    
   public void printDetails(){
       
       System.out.println("Book Id is = "+bookID);
        System.out.println("Book title is = "+title);
        System.out.println("Publisher is = "+publisher);
       
   }
    
  
    
}
