import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double min = 0;
        int loop_count = 0;
        while (true)
        {
            System.out.println("Enter a number, or any character to exit:");
            String next_entry = scanner.nextLine();
            try {
                double valid_num = Double.parseDouble(next_entry);
                if ((loop_count == 0) || (valid_num < min))
                {
                    min = valid_num;
                }
                if ((loop_count == 0) ||(valid_num > max))
                {
                    max = valid_num;
                }
                loop_count ++;
            }catch (NumberFormatException nfe)
            {
                break;
            }
        }
        if (loop_count > 0)
        {
            System.out.println("Min = " + min + "," + "Max = " + max);
        }else
        {
            System.out.println("No valid data entered !");
        }
    }
}
