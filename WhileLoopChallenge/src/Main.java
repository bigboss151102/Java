public class Main {
    public static void main(String[] args) {
        int number = 4;
        int finish_number = 20;
        int even_count = 0;
        int odd_count = 0;
        while (number <= finish_number)
        {
            number ++;
            if (!isEvenNumber(number))
            {
                odd_count ++;
                continue;
            }
            System.out.println("Even number: " + number);
            even_count ++;
            if (even_count >= 5)
            {
                break;
            }
        }
        System.out.println("Total odd number found: " + odd_count);
        System.out.println("Total even number found: " + even_count);
    }
    public static boolean isEvenNumber(int number)
    {
        if ((number % 2) == 0)
        {
            return true;
        }else
        {
            return false;
        }
    }
}
