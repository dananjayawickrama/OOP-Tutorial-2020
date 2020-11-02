/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_Lab_08_Collections;

import java.util.ArrayList;

/**
 *
 * @author Dananjaya
 */
public class Ex2 {
      public static void main(String args[]){
          
          
          
          Student obj1 = new Student("IT10","dana",3.54f);
          Student obj2 = new Student("IT11","Dilan",3.14f);
          
          ArrayList<Student> StudentList = new ArrayList();
          
          
          StudentList.add(obj1);
          StudentList.add(obj2);
          
         
          
          for(Student temp1 : StudentList){
              
              System.out.println(temp1.getStudentID());
              System.out.println(temp1.getName());
              System.out.println(temp1.getGpa());
              System.out.println("\n");
          }
          
      }
}
