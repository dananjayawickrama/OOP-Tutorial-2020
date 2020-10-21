/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_Lab_03_Inheritance_constructors_overriding;

/**
 *
 * @author Dananjaya
 */
public class Test_Ex1{
    
    public static void main(String args[]){
        
        /*
        Student_Ex1 s1 = new Student_Ex1();
        String name1 = s1.name = "Dananjaya";
        String itn1 = s1.ditNo = "IT111";
        String address1 = s1.address = "Malabe";
        
        Student_Ex1 s2 = new Student_Ex1();
        String name2 = s2.name = "Wickrama";
        String itn2 = s2.ditNo = "IT222";
        String address2 = s2.address = "Kandy";
        
        
        System.out.println("Name is = "+name1+"\nAddress is = "+address1+"\nDit no is = "+itn1);
        System.out.println("\nName is = "+name2+"\nAddress is = "+address2+"\nDit no is = "+itn2);
        
        
        */
        
        /*
        
        Student_Ex1 obj1 = new Student_Ex1("dilan", "IT6666", "Moratuwa");
        Student_Ex1 obj2 = new Student_Ex1("Kasun", "IT1111", "Malabe");
       
        
        */
        
        
        /*
        Student_Ex1 obj1 = new Student_Ex1("dilan", "IT6666", "Moratuwa");
        Student_Ex1 obj2 = new Student_Ex1("Kasun", "IT1111", "Malabe");
        
        System.out.println("\nStudent name is = "+obj1.getName());
        System.out.println("Student Dit No is = "+obj1.getditNo());
        System.out.println("Student Address is = "+obj1.address);
        
        
        System.out.println("\nStudent name is = "+obj2.getName());
        System.out.println("Student Dit No is = "+obj2.getditNo());
        System.out.println("Student Address is = "+obj2.address);
        
       */
        
        Student_Ex1 obj1 = new Student_Ex1("dilan", "IT6666", "Moratuwa");
        Student_Ex1 obj2 = new Student_Ex1("Kasun", "IT1111", "Malabe");
        
        String answer1 = obj1.getDetails();
        
        String answer2 = obj2.getDetails();
        
        System.out.println(answer1);
        System.out.println("");
        System.out.println(answer2);
        
    }
    
}
