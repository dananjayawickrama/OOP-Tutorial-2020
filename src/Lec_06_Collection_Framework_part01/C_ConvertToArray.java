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
public class C_ConvertToArray {
     public static void main(String args[]){
         
         
          ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
          arraylist1.add(12);
          arraylist1.add(32);
          arraylist1.add(6);
          
          //convert to array
          Integer[] myarray = new Integer[arraylist1.size()];
          myarray = arraylist1.toArray(myarray);
          
          for(int i = 0;i < myarray.length;i++){
              
              System.out.println("Array "+i+" Element is = "+myarray[i]);
              
          }
         
         
     }
    
}
