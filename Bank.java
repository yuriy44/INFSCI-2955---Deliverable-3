
import java.io.BufferedReader; 
import java.io.FileNotFoundException; 
import java.io.FileReader; 
import java.io.IOException; 
import java.util.ArrayList; 
  
public class Bank { 
      
    // set withdraw amount as double 
    double withdrawAmount; 
    // create an array list of checking accounts 
  
    private ArrayList<CheckingAccount> checkingAccounts = new ArrayList<CheckingAccount>(); 
    // create an array list of savings accounts 
    private ArrayList<SavingsAccount> savingsAccounts = new ArrayList<SavingsAccount>(); 
  
    // set a getter for the checking accounts 
    public ArrayList<CheckingAccount> getCheckingAccounts() { 
        return checkingAccounts; 
    } 
  
    // set a getter for the savings accounts 
    public ArrayList<SavingsAccount> getSavingsAccount() { 
        return savingsAccounts; 
    } 
  
    // establish a new method newAccount with String and double initialBalance , 
    // and long accountBalance 
    public void newAccount(String lastName, String firstName, String address, 
            String city, String state, String zipCode, 
            String socialSecurityNumber, double initialBalance, 
            long accountBalance, String accountType,int pin) { 
        if (accountType.equals("checking")) { 
            CheckingAccount checking = new CheckingAccount(accountType, 
                    accountType, accountType, accountType, accountType, 
                    accountType, accountType, accountType, initialBalance, 
                    accountType,pin); 
            checkingAccounts.add(checking); 
        } else if (accountType.equals("savings")) { 
            SavingsAccount saving = new SavingsAccount(accountType, 
                    accountType, accountType, accountType, accountType, 
                    accountType, accountType, accountType, initialBalance, 
                    accountType,pin); 
            savingsAccounts.add(saving); 
        } 
  
    } 
  
    private ArrayList<Account> accountList = new ArrayList<Account>(); 
  
    public ArrayList<Account> getAccountList() { 
        return this.accountList; 
    } 
  
    private ArrayList<Account> readAccountsFromTextFile() { 
  
        // The name of the file to open. 
        String fileName = "AccountList.txt"; 
  
        // This will reference one line at a time 
        String line = null; 
  
        try { 
            // FileReader reads text files in the default encoding. 
            FileReader fileReader = new FileReader(fileName); 
  
            // Always wrap FileReader in BufferedReader. 
            BufferedReader bufferedReader = new BufferedReader(fileReader); 
  
            while ((line = bufferedReader.readLine()) != null) { 
                // Split the line from input file into an array using comma as 
                // the delimiter 
                String[] accountInfo = line.split(","); 
                // Create new Account object 
                Account newAccount = new Account(accountInfo[0], 
                        accountInfo[1], accountInfo[2], accountInfo[3], 
                        accountInfo[4], accountInfo[5], accountInfo[6], 
                        accountInfo[7], Double.parseDouble(accountInfo[8]), 
                        accountInfo[10],Integer.parseInt(accountInfo[11])); 
                int pinNumber = Integer.parseInt(accountInfo[9]); 
                newAccount.setPinNumber(pinNumber); 
                String accountType = accountInfo[10]; 
                if (accountType.equals("checking")) { 
                    checkingAccounts.add((CheckingAccount) newAccount); 
                    System.out.println(newAccount); 
                } else if (accountType.equals("savings")) { 
                    savingsAccounts.add((SavingsAccount) newAccount); 
                    System.out.println(newAccount); 
                } 
  
            } 
  
            // Always close files. 
            bufferedReader.close(); 
        } catch (FileNotFoundException ex) { 
            System.out.println("Unable to open file '" + fileName + "'"); 
        } catch (IOException ex) { 
            System.out.println("Error reading file '" + fileName + "'"); 
        } 
        return accountList; 
    } 
  
    public Bank() { 
        this.readAccountsFromTextFile(); 
    } 
      
      
  
} 
