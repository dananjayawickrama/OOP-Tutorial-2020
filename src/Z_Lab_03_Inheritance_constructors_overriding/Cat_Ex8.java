
package Z_Lab_03_Inheritance_constructors_overriding;

public class Cat_Ex8 extends Pet_ex8{
    
   private int livesLeft;
   
    public Cat_Ex8(String n, String o, int a, int l) {
        super(n, o, a);
        this.livesLeft = l;
    }

    public Cat_Ex8(String n, String o) {
        
        super(n, o);
        this.livesLeft = 7;
    }
    
    public void showDetails(){
        
        super.showDetails();
        System.out.println("I am a cat. " +this.livesLeft + " lives remain for me.");
}
}