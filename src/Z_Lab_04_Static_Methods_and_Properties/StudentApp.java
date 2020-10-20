
package Z_Lab_04_Static_Methods_and_Properties;


public class StudentApp {
    public static void main(String args[]){
        
        
        Student obj1 = new Student("dananjaya", "BSc It", "01111");
        obj1.print();
        Student obj3 = new Student("dananjaya", "BSc It", "01111");
        obj1.print();
        
        
        System.out.println("\n");
        
        
        
        
        
        
       //using array
       
        Student obj2[] = new Student[3];
        
        obj2[0] = new Student("Dasun", "Eng", "11111");
        obj2[0].print();
        
        System.out.println("\n");
        
        obj2[1] = new Student("kasun", "SE", "222");
        obj2[1].print();
        
        
        
        
    }
}
