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
public class H_Throws_main {
    
      public static void main(String args[]){
          
          G_Throws_Class obj1 = new G_Throws_Class();
          obj1.add(2, 0);
          
          
          try {
              
              obj1.div(2, 0);
              
              
          } catch (ArithmeticException e) {
          
              System.out.println("Error:Division by zero!");
          
          }
          
          
          
          
      }
    
    
}
