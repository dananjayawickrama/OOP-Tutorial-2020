/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_Lab_06_Abstract_classes_interfaces_Part_02;

/**
 *
 * @author Dananjaya
 */
public class MainApp {
    
    public static void main(String args[]){
        
        /*
        // 1st method
        
        Tablet tobj1 = new Tablet("ITTablet", "Ore", 100.0, 50, "DD3", "Sony", "15px");
        
        Vegetables voj1 = new Vegetables("Vegi1232", "Beet", 40.0, 10, true, 3);
        

        
        IPrint arrayIprint[] = new IPrint[2];
        
        arrayIprint[0] = tobj1;
        arrayIprint[1] = voj1;
        
        
        for (int i = 0; i < 2; i++) {
			arrayIprint[i].printLine();
                        System.out.println("\n\n");
		}
        
        
        
        
        */
        
        
        
        
        //2nd method
        

        IPrint arrayIprint[] = new IPrint[2];
        
        arrayIprint[0] = new Tablet("ITTablet", "Ore", 100.0, 50, "DD3", "Sony", "15px");
        arrayIprint[1] = new Vegetables("Vegi1232", "Beet", 40.0, 10, true, 3);
        
        
        for (int i = 0; i < 2; i++) {
			arrayIprint[i].printLine();
                        System.out.println("\n\n");
		}
        
    }
    
}
