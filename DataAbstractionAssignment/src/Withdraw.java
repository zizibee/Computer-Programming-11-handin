import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    //Requires: none
    //Modifies: none
    //Effects: returns a String representing the withdraw information
    public String toString(){
        return "Withdraw of: " + amount + " Date: " + date + " into account: " + account;
    }
}
