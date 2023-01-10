public class Main {
    public static void main(String[] args) {
        Account bobsAccount = new Account();

        bobsAccount.setID("12345");
        bobsAccount.setBalance(5000.00);
        bobsAccount.setCustomerName("Hoang Cong Trong");
        bobsAccount.setCustomerEmail("hoangcongtrong054@gmail.com");
        bobsAccount.setCustomerPhone("0932441896");

        System.out.println("Customer ID: " + bobsAccount.getID());
        System.out.println("Balance of Account: " + bobsAccount.getBalance());
        System.out.println("Customer Name: " + bobsAccount.getCustomerName());
        System.out.println("Customer Email: " + bobsAccount.getCustomerEmail());
        System.out.println("Customer Phone: " + bobsAccount.getCustomerPhone());

        bobsAccount.withdrawFunds(500.00);
        bobsAccount.depositFunds(1000.00);
    }

}
