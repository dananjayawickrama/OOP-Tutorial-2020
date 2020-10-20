
package Lec_03_Inheritance_constructors_overriding_Array;


public class H_OverloadingMain {
    
  public static void main(String args[]){
      
      H_Overloading obj1 = new H_Overloading();
      obj1.name = "Dananjaya";
      obj1.nunber = 12;
      obj1.nextNumber();
      
      
      
      
      H_Overloading obj2 = new H_Overloading(100);
      int nn = obj2.nextNumber(0);
      System.out.println(nn);
  }

    
}
