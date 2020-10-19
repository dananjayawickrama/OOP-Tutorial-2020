/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec_02_Java_Classes_and_Objects_part01;

/**
 *
 * @author Dananjaya
 */
public class PersonMainClass {
    
     public static void main(String args[]){
         
         
         Person p1 = new Person();
         p1.setPID("101010");
         p1.setName("Dananajya");
         
         
         p1.displayDetails();
         
         
     }
    
}
