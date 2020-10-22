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
public class V_Person implements V_ICompute{
    
  private String name;
   private double basicSal;
   private double otRate;
   private double otHrs;
   private double netSal;
   
   
   V_Person(String n,double b,double otR,double oTH){
       
     name = n;
     basicSal = b;
     otRate = otR;
     otHrs = oTH;
   }
   
   
   public void calculate(){
       
       netSal = basicSal + otHrs * otRate;
       
   }
    
   public void display(){
     
       
       System.out.println("Name is = "+name+"\nNet Salary is = "+netSal);
     
 }
}