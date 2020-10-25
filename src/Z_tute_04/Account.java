package Z_tute_04;


public abstract class Account {
    
    private String accountNo, name;
    private double balance;
    
    
    public double getBalance(){
        return balance;
    }

    public Account(String accNo) {
    
        accountNo = accNo;
    }
    
    
    abstract public double calculateInterest();
    
    
    
    public double Deposit(double amount){
        
        balance = balance + amount;
        return balance;
    }
    
    public void display(){
        
        System.out.println("Account No is = "+accountNo);
        System.out.println("Name is = "+name);
        System.out.println("Balance is = "+balance);
    }
}
