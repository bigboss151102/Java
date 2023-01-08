public class Main {
    public static void main(String[] args) {
        int count_of_math = 0;
        int sum_of_math = 0;
        for (int loop_number = 1; loop_number <= 1000; loop_number ++)
        {
            if ((loop_number % 3 == 0) && (loop_number % 5 == 0))
            {
                count_of_math ++;
                sum_of_math += count_of_math;
                System.out.println("Found a match = " + loop_number);
            }
            if (count_of_math == 5)
            {
                break;
            }
        }
    }


}
