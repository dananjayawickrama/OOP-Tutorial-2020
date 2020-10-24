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
public class C_tryCatch01 {
    
    public static void main(String args[]){
        
        
        try {
            
            
            int number = 21 / 0;
            
            System.out.println("Answe is = "+number);
            
        }catch (ArithmeticException e) {
        
            System.out.println("Error is = "+e);
        }
        
        
        System.out.println("Good Buy!");
    }
    
}
