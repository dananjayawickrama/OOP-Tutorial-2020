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
public class F_hashMap {
    public static void main(String args[]){
        
            //hashmap remove the duplicate values
        
           HashMap<String,Double> a1 = new HashMap<>();
           a1.put("IT10", new Double(12));
           a1.put("IT20", new Double(23));
           
           
           
           Set<Map.Entry<String,Double>> a2 = a1.entrySet();
           
           
           for(Map.Entry<String,Double> temp : a2){
               
               System.out.print(temp.getKey()+" : ");
               System.out.println(temp.getValue());
           }
           
           
           // Deposit 1000 into  IT10's account.
           
           double balan = a1.get("IT10");
           
           a1.put("IT10", balan+1000);
           
           System.out.println("\nAdd 1000\n");
           
          for(Map.Entry<String,Double> temp : a2){
               
               System.out.print(temp.getKey()+" : ");
               System.out.println(temp.getValue());
           }
    }
    
}
