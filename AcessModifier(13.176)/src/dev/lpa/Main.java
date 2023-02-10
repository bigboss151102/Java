package dev.lpa;

public class Main {
    public static void main(String[] args) {
        Account trongAccount = new Account("Trong");
        trongAccount.deposit(1000);
        trongAccount.withDraw(500);
        trongAccount.withDraw(-200);
        trongAccount.deposit(-20);


        trongAccount.calculateBalance();
        System.out.println("Balance on account is " + trongAccount.getBalance());
    }


}
