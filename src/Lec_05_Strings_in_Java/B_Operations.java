/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec_05_Strings_in_Java;

/**
 *
 * @author Dananjaya
 */
public class B_Operations {
    
    public static void main(String args[]){
        
        
        String name = "kasun";
        String name2 = "kasun";
        
        
        
        if(name.equals(name2))
            System.out.println("Equeal");
        else 
            System.out.println("Not Equeals");
        
        
        
        System.out.println("\n----------------------------charAt()-------------------------");
        
        
        
        String details = "College";
        
        char details2 = details.charAt(4);
        
        System.out.println(details2);
        
        
        
          System.out.println("\n----------------------------trim()-------------------------\n");
          
          
          
          String sd = "             My Name is Kasun";
          
          System.out.println(sd.trim());
    }
    
}
