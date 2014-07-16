package softwaretest2;

public class CheckingAccount extends Account { 
    
    public static final int PENALTY_BALANCE = 35; 
    public static final int MINIMUM_BALANCE = 500; 
  
    public CheckingAccount(String lastName, String firstName, String address, 
            String city, String state, String zipCode, 
            String socialSecurityNumber, String accountNumber, 
            double accountBalance, String accountType,int pin) { 
        super(lastName, firstName, address, city, state, zipCode, socialSecurityNumber, 
                accountNumber, accountBalance, accountType,pin); 
    } 
  
    public void withdraw(double withdrawAmount) { 
        this.accountBalance -= withdrawAmount; 
        if (this.accountBalance < MINIMUM_BALANCE) { 
            accountBalance -= PENALTY_BALANCE; 
        } 
    } 
  
}
