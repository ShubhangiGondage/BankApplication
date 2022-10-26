package BankAccountsApp;

public class Saving extends Account{
    // List the properties for saving account
     private int safetyDepositBoxId;
     private int SafetyDepositBoxKey;
    // Constructor to initialize saving account properties
    public Saving(String name, String sSN, double initDeposit){
        super(name,sSN, initDeposit);
        accountNumber="1"+accountNumber;
        setSafetyDepositBoxId();
    }
    private void setSafetyDepositBoxId(){
        safetyDepositBoxId= (int) (Math.random()*Math.pow(10,3));  // that 3 means total digits
        SafetyDepositBoxKey =(int)(Math.random()*Math.pow(10,4));
    }
    @Override
    public void setRate(){
        rate=getBaseRate()-0.25;
    }
    // List any methods specific to saving account
    public void showInfo() {           //overriding method of account class
        super.showInfo();
        System.out.println("ACCOUNT TYPE: Savings");
        System.out.println("Your saving account features"+"\nSafety deposit box id: "+safetyDepositBoxId
        +"\nSafety deposit box key: "+ SafetyDepositBoxKey);
    }
}
