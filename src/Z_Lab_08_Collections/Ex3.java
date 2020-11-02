
package Z_Lab_08_Collections;

import java.util.HashSet;
import java.util.Scanner;


public class Ex3 {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        HashSet<Double> hs = new HashSet<>();
        hs.add(50.25);
        hs.add(50.25);
        hs.add(65.25);
        hs.add(80.0);
        hs.add(20.25);
        
        
        
        for(Double temp1 : hs){
            
            System.out.println(temp1);
        }
        
    }
    
}
