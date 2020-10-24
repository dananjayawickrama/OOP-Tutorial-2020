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
public class Finally {
    
     public static void main(String args[]){
         
         
         
           try {
               
            int a = args.length;
            System.out.println("a = " + a);

            int b = 42 / a;

            int c[] = {1};

            c[42] = 99;

     }catch (ArithmeticException e) {

         System.out.println("Divide by 0: " + e);

     }catch (NullPointerException e) {

         System.out.println("Null");

     } catch (ArrayIndexOutOfBoundsException e) {

         System.out.println("Array index oob: " + e);

     }finally{
               System.out.println("After try/catch blocks.");
           }

     
     
     
         
     }
    
}
