public class Account {
    private String ID;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    public void depositFunds(double depositAmount)
    {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is " + balance + " $");
    }

    public void withdrawFunds(double withdrawAmount)
    {
        if (balance < withdrawAmount )
        {
            System.out.println("Insufficient Funds! You only have " + balance + " $ in your account." );
        }else
        {
            balance -= withdrawAmount;
            System.out.println("Withdraw of " + withdrawAmount + " $ processed, Remaining balance = " + balance + " $");
        }
    }
    public String getID() {
        return ID;
    }

    public void setID(String number) {
        this.ID = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
