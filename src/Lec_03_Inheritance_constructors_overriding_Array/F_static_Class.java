/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec_03_Inheritance_constructors_overriding_Array;


public class F_static_Class {
    
    public int sId;
    public static String batchID;

    public F_static_Class() {
    
    }
    
    
    
    
    public void displyaDetails(){
        
        System.out.println("Student id is "+sId);
        System.out.println("batch ID is = "+batchID);
   }
    
    public static void nextbatchId(){
        
        System.out.println("next batch id is = "+batchID);
        
    }
}
