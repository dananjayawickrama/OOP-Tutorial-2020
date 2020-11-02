/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec_06_Collection_Framework_part01;

import java.util.ArrayList;

/**
 *
 * @author Dananjaya
 */
public class D_Calculation {
     public static void main(String args[]){
         
         ArrayList<Integer> a1 = new ArrayList();
         a1.add(12);
         a1.add(32);
         a1.add(4);
         
         Integer myA[] = new Integer[a1.size()];
         myA = a1.toArray(myA);
         
         
         //sum of 0 index and 2 index
         
         int sum = myA[0] + myA[2];
         
         System.out.println("Sum is = "+sum);
         
         
         
         
         
     }
    
}
