package BankAccountsApp;

public abstract class Account implements IBaseRate {
    // List Common Properties for saving and checking accounts
      private String name;
      private String sSN;
      private double balance;
      private static int index=10000;
      protected String accountNumber;
      protected double rate;
    // Constructor to set base properties and initialize the account
      public Account(String name, String sSN, double initDeposit){
         this.name=name;
         this.sSN=sSN;
         balance=initDeposit+100;
         index++;
         this.accountNumber=setAccountNumber();
         setRate();
      }
     private String setAccountNumber(){
          String lastTwoOfSSN= sSN.substring(sSN.length()-2,sSN.length());
          int uniqueId=index;
          int randomNumber=(int)(Math.random()*Math.pow(10,3));
          return lastTwoOfSSN+uniqueId+randomNumber;
     }
     public void compound(){
         double accuredInterest= balance * (rate/100);
         balance=balance+accuredInterest;
         System.out.println("Accured Interest: $"+ accuredInterest);
         printBalance();
     }
     public abstract void setRate();
    // List common methods - transactions
    public void deposit(double amount){
        balance=balance+amount;
        System.out.println("Depositing $"+amount);
        printBalance();
    }
    public void withdraw(double amount){
        balance=balance-amount;
        System.out.println("Withdrawing $"+amount);
        printBalance();
    }
    public void transfer(String toWhere,double amount){
        balance=balance-amount;
        System.out.println("Transfering $"+amount+" to "+toWhere);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balance is now: $"+balance);
    }
     public void showInfo(){
         System.out.println("Name: "+name+" "+"\nAccount Number: "+ accountNumber +"\nBalance: $"+balance
         +"\nRate: "+ rate +"%");
     }
}
