/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec_03_Inheritance_constructors_overriding_Array;

/**
 *
 * @author Dananjaya
 */
public class F_StaticMain {
    
    public static void main(String args[]){
        
        
        F_static_Class obj1 = new F_static_Class();
        obj1.sId = 10001;
        F_static_Class.batchID = "IT10001";
        
        obj1.displyaDetails();
        F_static_Class.nextbatchId();
        
    }
    
}
