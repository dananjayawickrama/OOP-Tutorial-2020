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
class ToyCat extends Cat { 
    
    String manufacturer; 
    
    public ToyCat(String name, String manufacturer)
    { 
        super(name);
        this.manufacturer = manufacturer;
    
    } 
    
      
    public ToyCat() 
    { 
        System.out.println("ToyCat constructor called"); 
    
    } 
    
    
    
    public void display() 
    {
        super.display();
        System.out.println("I am from " + manufacturer + "."); 
    }

}