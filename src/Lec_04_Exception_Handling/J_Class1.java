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
public class J_Class1 {

  public static void main (String args[ ]) {
      
    int x = 5, y = 1000;

    try {

        float z = (float) x / (float) y;

        if(z < 0.01) {

            throw new I_MyExceptionClass("Number is too small") ;

        }

    }catch (I_MyExceptionClass e) {

        System.out.println("Caught my exception");

        System.out.println(e.getMessage());

    } finally {

        System.out.println("I am always here") ;
    
    }

  }

}