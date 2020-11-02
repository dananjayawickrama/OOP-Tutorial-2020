/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_Lab_08_Collections;

/**
 *
 * @author Dananjaya
 */
public class E4_Class {
    
 
    private String studentID, Name;
    private float gpa;
    

    
    public E4_Class(String s, String n, float g){
        
        studentID = s;
        Name = n;
        gpa = g;
    }
    
    
    public String getStudentID(){
        return studentID;
    }
 
    public String getName(){
        return Name;
    }
      
    public float getGpa(){
        return gpa;
    }
    
    
    
    
    public void details(){
        
        System.out.println("Studen Id is = "+getStudentID());
        System.out.println("Student Name is = "+getName());
        System.out.println("Student Gpa is = "+getGpa());
    }
    
}
