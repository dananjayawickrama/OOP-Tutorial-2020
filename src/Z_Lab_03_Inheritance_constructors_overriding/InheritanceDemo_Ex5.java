
package Z_Lab_03_Inheritance_constructors_overriding;


public class InheritanceDemo_Ex5 {
    
    public static void main(String args[]){
        
        
        /*
        Person_Ex5 obj1 = new Person_Ex5();
        obj1.name = "Dasuni";
        obj1.address = "Colombo";
        
        obj1.showDetails();

        */
        
        /*
        
        
        Student_Ex5 obj2 = new Student_Ex5();
        obj2.name = "Dasuni";
        obj2.address = "Colombo";
        obj2.studentid = "IT171717";
        obj2.showDetails();
        

        */
        
        
        PartTimeStudent_Ex5 obj2 = new PartTimeStudent_Ex5();
        obj2.name = "Dasuni";
        obj2.address = "Colombo";
        obj2.studentid = "IT171717";
        obj2.noOFWorkingH = 12;
        obj2.showDetails();
    }
    
}
