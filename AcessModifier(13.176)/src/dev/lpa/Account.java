package dev.lpa;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    public ArrayList<Integer> transaction;

    public Account(String accountName)
    {
        this.accountName = accountName;
        this.transaction = new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount)
    {
        if (amount > 0)
        {
            transaction.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited.Balance is now " + this.balance);
        }else
        {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withDraw(int amount)
    {
        int withDrawl = -amount;
        if (withDrawl < 0)
        {
            this.transaction.add(withDrawl);
            this.balance += withDrawl;
            System.out.println(amount + " withdraw.Balance is now " + this.balance);
        }else
        {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    public void calculateBalance()
    {
        this.balance = 0;
        for (int i : this.transaction)
        {
            this.balance += i;
        }
        System.out.println("Caculated balance is " + this.balance);
    }

}
