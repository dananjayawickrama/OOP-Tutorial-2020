/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_Lab_03_Inheritance_constructors_overriding;

/**
 *
 * @author Dananjaya
 */
public class Dog_Ex8 extends Pet_ex8{
    
    int noOfMasters;
    
    
    Dog_Ex8(String n, String o, int a, int m){
        
        super(n,o,a);
        this.noOfMasters = m;
    }
    
    Dog_Ex8(String n, String o){
        
            super(n,o,0);
            noOfMasters = 1;
    }
    
    
   public void showDetails(){
       
    
    System.out.println("I am a dog."+"I have "+noOfMasters+" masters at home.");

}
    
}
