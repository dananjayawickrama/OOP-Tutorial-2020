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
public class A_Add_remove {
    
    public static void main(String args[]){
        
        
        ArrayList arr1 = new ArrayList();
        
        
        arr1.add('A');
        arr1.add("dananjaya");
        arr1.add(12);
        arr1.add(1.25);
        arr1.add(12.58);
        
        //remove the 4th elements
        arr1.remove(4);
        
        System.out.println(arr1);
        
        
  
        
        
    }
    
}
