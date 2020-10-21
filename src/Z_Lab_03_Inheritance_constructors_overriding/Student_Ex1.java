
package Z_Lab_03_Inheritance_constructors_overriding;


public class Student_Ex1 {
    
    
    String name;
    String ditNo;
    String address;
    
    public Student_Ex1(String name,String ditNo,String address){
        
        this.name = name;
        this.ditNo = ditNo;
        this.address = address;
        
    }
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setditNo(String no){
        ditNo = no;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    
    public String getName(){
        return name;
    }
    
    public String getditNo(){
        return ditNo;
    }
    
    public String getAddress(){
        return address;
    }
    
    
    public String getDetails(){
        
        String details = "I am a Student.\nMy Name is "+getName()+"\nI am from "+getAddress()+"\nMy dit no is "+getditNo();
        
        return details;
    }
}
