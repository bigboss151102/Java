public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++  )
        {
            System.out.println(i);
        }
        int j = 1;
        boolean is_ready = false;
        do {
            if (j > 5)
            {
                break;
            }
            System.out.println(j);
            j++;
            is_ready = (j > 0);
        }while (is_ready);
        int number = 0;
        while (number < 50)
        {
            number += 5;
            if (number % 5 == 0)
            {
                continue;   
            }
            System.out.println(number + "_");
        }
    }
}
