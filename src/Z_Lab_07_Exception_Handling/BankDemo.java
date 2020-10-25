/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Z_Lab_07_Exception_Handling;

import java.util.Scanner;

/**
 *
 * @author Dananjaya
 */
public class BankDemo {
    
    public static void main(String args[]){
        
        
        Scanner sc = new Scanner(System.in);
        
        Account accobj1 = new Account(123);
        
       
        
        try {
            
                
                BankDemo.nextProcess(accobj1);
            
            
        }catch (InsufficientBalanceException e) {
        
            System.out.println("Sorry your account remains only Rs. "+e.getAmount());
            e.printStackTrace();
        
        }finally{
        
                    System.out.println("Do you want to Continue:");
                    String condition = sc.next();
                    
                   try {
                
                        if(condition.equalsIgnoreCase("yes")){
                        
                        Account accobj2 = new Account(123);
                        BankDemo.nextProcess(accobj2);
                        }
                       
                       
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        }
    }
    
    
    
    public static void nextProcess(Account accountobj1) throws InsufficientBalanceException{
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Depositing Rs.10000");
        accountobj1.deposit(10000);
        
        
        while (true){
            
            System.out.println("Plz enter amount to be withdrawn:");
            double amount = sc.nextDouble();
            accountobj1.withdraw(amount);
            
        }
        
    }
    
}
