/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec_06_Collection_Framework_part01;

import java.util.HashSet;

/**
 *
 * @author Dananjaya
 */
public class E_hashSet {
     public static void main(String args[]){
         
         
         //remove the duplicate values -> HashSet
         
         HashSet<Integer> a1 = new HashSet<>();
         a1.add(12);
         a1.add(13);
         a1.add(12);
         
         System.out.println(a1);
         
         Integer myA[] = new Integer[a1.size()];
         myA = a1.toArray(myA);
         
         int sum = myA[0] + myA[1];
         
         System.out.println("Sum is = "+sum);
         
         
     }
    
}
