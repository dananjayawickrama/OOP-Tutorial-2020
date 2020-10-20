
package Lec_03_Inheritance_constructors_overriding_Array;


public class H_Overloading {
    
    
         
         int nunber;
         String name;
         
         //constructor overloading
         public H_Overloading(){
         
         }
         
         public H_Overloading(int number){
             
             this.nunber = number;
             name = "Wick";
         }
         
         
         //method overloading
         
         public void nextNumber(){
             System.out.println(name);
             System.out.println(nunber+1);
         }
         
         public int nextNumber(int nu){
             
             return nu+1;
         }
         
         
         
         
     
    
}
