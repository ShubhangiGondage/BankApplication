package BankAccountsApp;
import BankAccountsApp.utilities.csv;

import java.util.LinkedList;
import java.util.List;
public class BankAccApp {
    public static void main(String[] args) {
        List<Account> accounts=new LinkedList<>();
        // Read .csv file then create new accounts based on that data
        String file="D:\\shubh\\Documents\\BCS\\BankAppFile.txt";
        List<String[]> newAccountHolder = csv.read(file);
        for(String[] accountHolder: newAccountHolder){
            String name=accountHolder[0];
            String sSN=accountHolder[1];
            String accountType=accountHolder[2];
            double initDeposit= Double.parseDouble(accountHolder[3]);
            if(accountType.equals("Savings")) {
                accounts.add(new Saving(name,sSN,initDeposit));
            }else if(accountType.equals("Checking")){
                accounts.add(new Checking(name,sSN,initDeposit));
            }else{
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }
        for(Account ac:accounts){
            System.out.println("\nNew Account");
            System.out.println("***************************");
            ac.showInfo();
        }
    }
}
