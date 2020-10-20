
package Lec_03_Inheritance_constructors_overriding_Array;

import java.util.Scanner;

public class E_D_Array_two_dimensional_Exam {
    
    public static void main(String args[]){
        
        
        double studentsMarks[][] = new double[2][3];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i < 2;i++){
            
                for(int e = 0;e < 3;e++){
                    
                    System.out.println("Enter "+(i+1)+" Student mark "+(e+1)+" : ");
                    studentsMarks[i][e] = sc.nextDouble();
                }
                System.out.println("\n");
        }
        
        
        System.out.println("\nStudents Marks\n");
        
        for(int q = 0;q < 2;q++){
            
            double averageMark = 0;
            
            for(int a = 0;a < 3;a++){
                
                 System.out.println((q+1)+" Student "+(a+1)+" Mark: "+studentsMarks[q][a]);
                 averageMark = averageMark + studentsMarks[q][a];
            }
            
            System.out.println((q+1)+" Student Average Mark:"+(averageMark / 3));
            
            System.out.println("\n");
            
        }
        
        
        
        
        
        
    }
    
}
