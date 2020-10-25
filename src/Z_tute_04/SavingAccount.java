/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_tute_04;

/**
 *
 * @author Dananjaya
 */
public class SavingAccount extends FixedDepositAccount{

    
    
    
    public SavingAccount(String accNo) {
        super(accNo);
    }
    
    
   
    
    
    
    
    public double withdraw(double amount){
        
        double balance = getBalance();
        balance = balance - amount;
        return balance;
        
    }
    
    
    
    
    public double calculateInterest(){
        
        double balance = getBalance();
        double interestRate = getInterestRate();
        
        double interest = balance * interestRate/100/12;
        return interest;
        
    }
}
