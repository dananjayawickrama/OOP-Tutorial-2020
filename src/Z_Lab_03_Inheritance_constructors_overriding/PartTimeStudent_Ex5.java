
package Z_Lab_03_Inheritance_constructors_overriding;


public class PartTimeStudent_Ex5 extends Student_Ex5{
    
    int noOFWorkingH;
    
    
     public void showDetails(){
        System.out.println("PartTimeStudent Name is = "+name);
        System.out.println("PartTimeStudent Address is = "+address);
        System.out.println("PartTimeStudent Id is = "+studentid);
         System.out.println("PartTimeStudent Working hours = "+noOFWorkingH);
    }
    
}
