
package Z_Lab_03_Inheritance_constructors_overriding;


public class Student_Ex5 extends Person_Ex5{
    
    String studentid;
    
    
    //method overriding
    
    public void showDetails(){
        System.out.println("Student Name is = "+name);
        System.out.println("Student Address is = "+address);
        System.out.println("Student Id is = "+studentid);
    }
    
}
