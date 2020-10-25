
package Lec_05_Strings_in_Java;


public class A_String_Literal_String_Object {
    
    public static void main(String args[]){
        
        
        String name1 = "Dananjaya";
        String name2 = "Dananjaya";
        
        if(name1 == name2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        
        System.out.println("--------------------------Objects-----------------------");
        
        String n1 = new String("AAA");
        String n2 = new String("AAA");
        
        
        if(n1 == n2){
            
            System.out.println("True");
        }else{
        
        System.out.println("False");
    }
        
    }
    
}
