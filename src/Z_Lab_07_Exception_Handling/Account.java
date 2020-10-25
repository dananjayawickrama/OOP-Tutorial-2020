/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_Lab_07_Exception_Handling;

/**
 *
 * @author Dananjaya
 */
public class Account {
    
    private int accountNo;
    private double balance;

    
    public Account(int a) {
    
        accountNo = a;
    }
    
    
    public double deposit(double amount){
        
        balance = balance + amount;
        return balance;
    }
    
    
    public double withdraw(double amount) throws InsufficientBalanceException{
        
        if(amount > balance){
            //InsufficientBalanceException obk = new InsufficientBalanceException(balance);
           // throw obk;
           
           throw new InsufficientBalanceException(balance);
        
        }else{
            
            balance = balance - amount;
            System.out.println("Withdrawing Rs. "+amount);
            System.out.println("Existing amount is Rs."+balance);
            return balance;
        }
        
    }
    
}
