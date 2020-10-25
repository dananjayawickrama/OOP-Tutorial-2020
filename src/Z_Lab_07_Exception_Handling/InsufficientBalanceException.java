
package Z_Lab_07_Exception_Handling;


public class InsufficientBalanceException extends Exception{
    
    
    double amount;

    public InsufficientBalanceException(double a) {
    
        amount = a;
    }
    
    
    public double getAmount(){
        
        return amount;
    }
    
    
    
}
