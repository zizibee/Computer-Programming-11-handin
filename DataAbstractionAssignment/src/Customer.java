import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer(){
        //create default constructor
        this("Jane Doe", 0, 0, 0);
    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;
        this.deposits = new ArrayList<Deposit>();
        this.withdraws = new ArrayList<Withdraw>();
        this.savingRate = 0.05;
    }

    //Requires: double for amount, Date object for date, String for account type
    //Modifies: this
    //Effects: adds amount deposited to the appropriate account balance and tracks transaction information.
    //         Returns new balance for the account type.
    public double deposit(double amt, Date date, String account){
        deposits.add(new Deposit(amt, date, account));
        if (account.equals(CHECKING)) {
            checkBalance += amt;
            return checkBalance;
        }
        else {
            savingBalance += amt;
            return savingBalance;
        }
    }

    //Requires: double for amount, Date object for date, String for account type
    //Modifies: this
    //Effects: subtracts amount withdrawn from the appropriate account balance and tracks transaction information.
    //         Returns new balance for the account type. Will not modify balance if amount withdrawn is an overdraft.
    public double withdraw(double amt, Date date, String account){
        if (checkOverdraft(amt, account) == false) {
            if (account.equals(CHECKING)) {
                System.out.println("Error: Checking Overdraft");
                return checkBalance;
            }
            else {
                System.out.println("Error: Saving Overdraft");
                return savingBalance;
            }
        }

        withdraws.add(new Withdraw(amt, date, account));
        if (account.equals(CHECKING)) {
            checkBalance -= amt;
            return checkBalance;
        }
        else {
            savingBalance -= amt;
            return savingBalance;
        }
    }

    //Requires: double for amount, String for account type
    //Modifies: none
    //Effects: checks if amount withdrawn will result in an overdraft.
    //         Returns True if it is an overdraft.
    private boolean checkOverdraft(double amt, String account){
        if (account.equals(CHECKING)) {
            return(checkBalance - amt >= 0);
        }
        else {
            return(savingBalance - amt >= 0);
        }
    }

    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
