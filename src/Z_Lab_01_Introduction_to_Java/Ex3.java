/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_Lab_01_Introduction_to_Java;

/**
 *
 * @author Dananjaya
 */
public class Ex3 {
    
    public static void main(String args[]){
        
        String a = "Adult";
        String c = "Child";
        int age = 2;
        
        if(age > 18)
            System.out.println(a);
        else if(age < 18 && age > 0)
            System.out.println(c);
        else
            System.out.println("Invalid!");
        
        
        
    }
    
    
    
}
