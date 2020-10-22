/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_Lab_05_Abstract_classes_interfaces_Part_01;

/**
 *
 * @author Dananjaya
 */
class Dog extends Animal { 
    
    public Dog(String name) 
    { 
        super(name); 
    
    } 
    
     public Dog() 
    { 
        System.out.println("Dog constructor called"); 
    
    } 
    
    
    public String speak() 
    {
        return "Bow Wow";
    } 

}