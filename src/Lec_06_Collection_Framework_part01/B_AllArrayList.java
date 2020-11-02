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
public class B_AllArrayList {
     public static void main(String args[]){
         
         //integer
         ArrayList<Integer> arraylist1 = new ArrayList();
         arraylist1.add(10);
         arraylist1.add(20);
         arraylist1.add(30);
         
         //String
         ArrayList<String> arrayList2 = new ArrayList<>();
         arrayList2.add("Dana");
         arrayList2.add("Dilan");
         arrayList2.add("Dasun");
         
         
         
         //All
         ArrayList arrayList3 = new ArrayList();
         arrayList3.add("Dilan");
         arrayList3.add('A');
         arrayList3.add(12);
         
         
         System.out.println("Integer ArrayList\n");
         
         for(Integer temp1 : arraylist1){
             
             System.out.println(temp1);
         }
         
         System.out.println("\nString ArrayList\n");
         
           for(String temp2 : arrayList2){
             
             System.out.println(temp2);
         }
           
        System.out.println("\nAll ArrayList\n");
         
           for(Object temp3 : arrayList3){
             
             System.out.println(temp3);
         
     }
    
           
     }
}
