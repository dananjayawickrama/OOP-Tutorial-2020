
package Z_Lab_03_Inheritance_constructors_overriding;


public class Pet_ex8 {
    
    private String name;
    private String owner;
    private int age;

    
    public Pet_ex8(){
        
    }
    
    public Pet_ex8(String n, String o, int a) {
    
        this.name = n;
        this.owner = o;
        this.age = a;
    }
    
    
    public Pet_ex8(String n, String o){
        
        name = n;
        owner = o;
        age = 0;
    }
    
    
    public void showDetails(){
    
    System.out.println("I am a pet. My name is "+this.name+". My owner is "+this.owner);

}

}