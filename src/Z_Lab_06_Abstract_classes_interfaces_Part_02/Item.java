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
public class Item implements IPrint{
    
    private String itemNo, name;
    private double unitPrice;
    private int qty;
    
    
    public Item(String iNo,String n,double p,int q){
        
        itemNo = iNo;
        name = n;
        unitPrice = p;
        qty = q;
    }
    
    
    
    public String getItemNo(){
        
        return itemNo;
    }
    
    public String getName(){
        
        return name;
        
    }
    
    public double getUnitPrice(){
        
       return unitPrice;
        
    }
    
    public int getQty(){
        
        return qty;
        
    }


     public void printLine(){
         
         System.out.println("Item No is = "+itemNo+"\nItem Name is = "+name+"\nItem Price is = "+unitPrice+"\nItem Quantity is = "+qty);
         
     }
    public void printDetails(){
        
        System.out.println("Item No is = "+itemNo);
        System.out.println("Item Name is = "+name);
        System.out.println("Item Price is = "+unitPrice);
        System.out.println("Item Quantity is = "+qty);
    }
    
}
