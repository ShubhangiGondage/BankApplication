package BankAccountsApp;

public class Checking extends Account{
    // List the properties for checking account
     private int debitCardNumber;
     private int debitCardPin;
    // Constructor to initialize checking account properties
     public Checking(String name, String sSN, double initDeposit){
         super(name,sSN,initDeposit);
         accountNumber="2"+accountNumber;
     }
     @Override
     public void setRate(){
        rate=getBaseRate()*0.15;
    }
     // List any methods specific to checking account
     private void setDebitCardNumber(){
         debitCardNumber= (int) (Math.random()*Math.pow(10,12));
         debitCardPin= (int) (Math.random()*Math.pow(10,4));
     }
     public void showInfo() {           //overriding method of account class
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Checking");
     }
}
