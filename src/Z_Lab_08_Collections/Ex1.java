/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_Lab_08_Collections;

import java.util.ArrayList;
import java.util.Scanner;


public class Ex1 {
    
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        int numbersArray[] = new int[10];
        
        int calculateNumbers = 0;
        
        ArrayList<Integer> a1 = new ArrayList();
        
        if(a1.isEmpty()){
            
            for(int i = 0;i < 10;i++){
                
                System.out.print("Enter "+(i+1)+" Number : ");
                numbersArray[i] = sc.nextInt();
                
                a1.add(numbersArray[i]);
            }
            
        }else{
            
            System.out.println("Array list is not Empty");
        }
        
        
        
        System.out.println("\n***************************Calculate Numbers**********************************\n");
        
        Integer arrayListToArray[] = new Integer[a1.size()];
        
        arrayListToArray = a1.toArray(arrayListToArray);
        
        
        for(int e = 0;e < 10;e++){
            
            calculateNumbers = calculateNumbers + arrayListToArray[e];
        }
        
        
        System.out.println("10 Numbers Calculation is  = "+calculateNumbers);
    }
}
