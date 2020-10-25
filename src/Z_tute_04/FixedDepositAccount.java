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
public class FixedDepositAccount extends Account{
    
    
    
    private double interestRate,interest;
    
    
    public FixedDepositAccount(String accNo){
        
        super(accNo);
    }
    
    
    public void setInterestRate(double interestRate){
        this.interestRate = interestRate;
    }
    
    public double getInterestRate(){
        return interestRate;
    }
    
    public double calculateInterest(){
        
        double balance = getBalance();
        
        interest = balance * interestRate/100;
        return interest;
    }
    
}
