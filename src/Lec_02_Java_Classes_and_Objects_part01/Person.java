
package Lec_02_Java_Classes_and_Objects_part01;

public class Person {
    
    private String personId;
    private String name;

    
    public Person() {
    
    }
    
    public String getPID() {
    
        return personId;
  
    }
 
    public void setPID(String newpid){
        
        personId = newpid;
    }
    
   
    
    public void setName(String name){
        
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    
    public void displayDetails(){
        
        System.out.println("person Id is "+getPID());
        System.out.println("person name is "+getName());
    }
    
}
