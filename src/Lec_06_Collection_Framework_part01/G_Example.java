/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec_06_Collection_Framework_part01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Dananjaya
 */
public class G_Example {
     public static void main(String args[]){
         
         HashMap<String,Double> hm = new HashMap<>();
         
         hm.put("IT1010", new Double(1000));
         hm.put("IT1011", new Double(5000));
         hm.put("IT1012", new Double(7000));
         
         
         Set<Map.Entry<String,Double>> hms = hm.entrySet();
         
      
         for(Map.Entry<String,Double> temp1 : hms){
             
             System.out.print(temp1.getKey()+" : ");
             System.out.println(temp1.getValue());
         }
         
         //enter 1000 for IT1010 account
         
         double valueA = hm.get("IT1010");
         
         hm.put("IT1010", (valueA+1000));
         
         System.out.println("\nAfter Input 1000 into IT1010\n");
         
         for(Map.Entry<String,Double> temp2 : hms){
             
              System.out.print(temp2.getKey()+" : ");
             System.out.println(temp2.getValue());
         }
         
     }
    
}
