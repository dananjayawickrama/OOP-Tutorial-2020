
package Z_Lab_02_Calculations_input_data;


public class Ex1 {
    public static void main(String args[]){
        
        int miles,yards;
        double kilometers;
        miles = 26;
        yards = 385;
        
        kilometers =(double) (miles * 1.609) + (yards * 1.609 / 1760);

        System.out.println("Kilometers = "+kilometers);
        
        
        
        
        
    }
    
}
