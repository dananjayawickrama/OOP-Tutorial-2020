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
public class Tablet extends Item{
    
    private String brand, model, camera;

    public Tablet(String iNo,String n,double p,int q,String b,String m,String c) {
        super(iNo, n, p, q);
        brand = b;
        model = m;
        camera = c;
        
    }
    
    
    public void printLine(){
         
         System.out.println("Item No is = "+getItemNo()+"\nItem Name is = "+getName()+"\nItem Price is = "+getUnitPrice()+"\nItem Quantity is = "+getQty()+"\nItem Brand is = "+brand+"\nItem Model is = "+model+"\nCamera is = "+camera);
         
     }
    public void printDetails(){
        
        System.out.println("Item No is = "+getItemNo());
        System.out.println("Item Name is = "+getName());
        System.out.println("Item Price is = "+getUnitPrice());
        System.out.println("Item Quantity is = "+getQty());
        System.out.println("Item Brand is = "+brand);
        System.out.println("Item Model is = "+model);
        System.out.println("Camera is = "+camera);
    }
    
}
