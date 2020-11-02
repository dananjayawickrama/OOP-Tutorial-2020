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
public class H_Exam2 {
    
    public static void main(String args[]){
        
        HashMap<String,Integer> hm = new HashMap();
        hm.put("AC01", new Integer(1000));
        hm.put("AC02", new Integer(25000));
        hm.put("AC03", new Integer(50000));
        
        
        Set<Map.Entry<String,Integer>> sm1 = hm.entrySet();
        
        
        for(Map.Entry<String,Integer> temp1 : sm1){
            
              System.out.print(temp1.getKey()+" : ");
              System.out.println(temp1.getValue());
        }
        
        
        
        //insert 100 to AC01
        
        int oneV = hm.get("AC01");
        
        hm.put("AC01", (oneV+100));
        
        
        System.out.println("\n");
               
        for(Map.Entry<String,Integer> temp1 : sm1){
            
              System.out.print(temp1.getKey()+" : ");
              System.out.println(temp1.getValue());
        }
        
        
        
    }
    
}
