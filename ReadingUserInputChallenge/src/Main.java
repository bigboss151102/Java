import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        double sum = 0;
        do {
            System.out.println("Enter number " + count + ":");
            String next_number = scanner.nextLine();
            try{
                double number = Double.parseDouble(next_number);
                count ++;
                sum += number;
            }catch (NumberFormatException nfe)
            {
                System.out.println("Invalid number !");
            }
        }while (count <= 5);
        System.out.println("The sum of the 5 number: " + sum);
    }
}
