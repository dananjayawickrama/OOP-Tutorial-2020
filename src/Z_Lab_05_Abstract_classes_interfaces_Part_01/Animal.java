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

public abstract class Animal { 
    
    private String name;
    
    public Animal(String name) 
    {
        this.name = name; 
    } 
    
    public Animal() {
    
        System.out.println("Animal constructor called");
    }
    
    
    abstract public String speak(); 
   
    
    public void display() 
    {
        System.out.println("My name is " + this.name + ". " + this.speak() + "."); 
    } 


}