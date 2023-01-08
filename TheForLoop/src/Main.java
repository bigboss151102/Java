public class Main {
    public static void main(String[] args) {
        for (int counter = 0; counter <= 5; counter ++)
        {
            System.out.println(counter);
        }

        for (double rate = 2.0; rate <= 5.0; rate++ )
        {
            double interest_amount = cacultateInterest(10000.0, rate);
            System.out.println("10,000 at " + rate + "% interest = " + interest_amount);
        }

        for (double i = 7.5; i <= 10; i++)
        {
            double interest_amount = cacultateInterest(100.00, i);
            if (interest_amount > 8.5)
            {
                break;
            }
            System.out.println("$100.00 at " + i + "% interest = $" + interest_amount);
        }
    }
    public static double cacultateInterest(double amount, double interest_rate){
        return (amount * (interest_rate / 100));
    }
}
