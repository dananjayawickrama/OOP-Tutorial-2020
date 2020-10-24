/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec_04_Exception_Handling;

/**
 *
 * @author Dananjaya
 */
public class E_tryCatch02 {
    
 public static void main(String args[]){
        
        
        String number = "123";
        String name = "Dananjaya";
        
        
        try {
         
               //convert number to int
        
        int number2 = Integer.parseInt(number);
        
        
        //convert name into int
        
        int name2 = Integer.parseInt(name);
            
     } catch (Exception e) {
     
            System.out.println("Exception is "+e);
            System.out.println("Plz try again");
     }
        
     
        
        
        
        
    }
    
}
