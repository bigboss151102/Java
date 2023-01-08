public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 50; i++ )
        {
            if (isPrime(i))
            {
                System.out.println("number " + i + " is a prime number");
                count++;
            }
        }
    }
    public static boolean isPrime(int whole_number){
        if (whole_number <= 2)
        {
            return (whole_number == 2);
        }
        for (int divisor = 2; divisor <= whole_number / 2; divisor ++)
        {
            if (whole_number % divisor == 0)
            {
                return false;
            }
        }
        return true;
    }
}
