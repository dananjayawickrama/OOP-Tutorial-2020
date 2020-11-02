/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_Lab_08_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Dananjaya
 */
public class E4 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        E4_Class obj1 = new E4_Class("IT10","dana",3.54f);
        E4_Class obj2 = new E4_Class("IT11","Dilan",3.14f);
        
        HashMap<String,E4_Class> hm = new HashMap();
        
        hm.put(obj1.getStudentID(), obj1);
        hm.put(obj2.getStudentID(), obj2);
        

        System.out.print("Enter Student Number:");
        String number = sc.next();
        
        E4_Class s1 = hm.get(number);
        
        
        if(s1 != null)
            s1.details();
        else
            System.out.println("Invalid Student Number");
        
        
        
        
        
        
        
    }
}
