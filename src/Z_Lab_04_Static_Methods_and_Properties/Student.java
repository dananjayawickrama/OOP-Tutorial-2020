
package Z_Lab_04_Static_Methods_and_Properties;

public class Student {
    
    private int studentID;
    private String name;
    private String degree;
    private String mobile;
    private static int max = 100;
    
    
    public Student(String name,String degree,String mobile){
        
        this.name = name;
        this.degree = degree;
        this.mobile = mobile;
    }
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setDegree(String degree){
        this.degree = degree;
    }
    
    public String getDegree(){
        return degree;
    }   
    
    public void setMobile(String m){
        mobile = m;
    }
    
    public String getMobile(){
        return mobile;
    }
    
    public static int getNextStudentID(){
        
        max = max +1;
        return max;
    }
    
    
    public void print(){
        System.out.println("Student name is = "+getName());
        System.out.println("Student Degree is = "+getDegree());
        System.out.println("Student Mobile is = "+getMobile());
        System.out.println("Student Id is = "+Student.getNextStudentID());
    }
    
}
