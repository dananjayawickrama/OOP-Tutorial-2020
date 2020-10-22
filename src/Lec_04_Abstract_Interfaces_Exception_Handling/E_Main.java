/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec_04_Abstract_Interfaces_Exception_Handling;


public class E_Main {
    
    public static void main(String args[]){
        
        
        B_RShape_Class robj1 = new B_RShape_Class();
        robj1.length = 2;
        robj1.width = 3;
        double answer = robj1.getArea();
        System.out.println("Rectangle Area is = "+answer);
        
        System.out.println("");
        
        C_CirShaape_class coj1 = new C_CirShaape_class();
        coj1.r = 7;
        double answer2 = coj1.getArea();
        System.out.println("Circle Area is = "+answer2);
    }
    
}
