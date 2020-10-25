/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_Lab_06_Abstract_classes_interfaces_Part_02;

/**
 *
 * @author Dananjaya
 */
public class Vegetables extends Item{
    
    
    private boolean organic;
    private int calories;
    
    
    public Vegetables(String iNo,String n,double p,int q,boolean o,int calories){
        
        super(iNo, n, p, q);
        organic = o;
        this.calories = calories; 
    }
    
    
    
    
    public void printLine(){
         
         System.out.println("Item No is = "+getItemNo()+"\nItem Name is = "+getName()+"\nItem Price is = "+getUnitPrice()+"\nItem Quantity is = "+getQty()+"\nOrganicBrand is = "+organic+"\ncalories are = "+calories);
         
     }
    public void printDetails(){
        
        System.out.println("Item No is = "+getItemNo());
        System.out.println("Item Name is = "+getName());
        System.out.println("Item Price is = "+getUnitPrice());
        System.out.println("Item Quantity is = "+getQty());
        System.out.println("organic is = "+organic);
        System.out.println("calories are = "+calories);
        
    }
    
    
    
    
}
