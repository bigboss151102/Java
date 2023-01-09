import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int current_year = 2022;
        
        try {
            System.out.println(getInputFromConsole(current_year));
        }catch (NullPointerException e)
        {
            System.out.println(getInputFromScanner(current_year));
        }
    }

    public static String getInputFromConsole(int current_year)
    {
        String name = System.console().readLine("Hi, What is your name ?: ");
        System.out.println("Hi " + name + ", Thanks for talking the course !");

        String date_of_birth = System.console().readLine("What year were you born ?: ");
        int age = current_year - Integer.parseInt(date_of_birth);

        return "So you are " + age + " years old";
    }


    public static String getInputFromScanner(int current_year)
    {
        Scanner scanner = new Scanner(System.in);
        // String name = System.console().readLine("Hi. What's your Name ?: ");
        System.out.println("Hi, What's your Name ?: ");
        String name = scanner.nextLine();

        // String date_of_birth = System.console().readLine("What year were you born ?: ");
        System.out.println("What year were you born ?: ");
        String date_of_birth = scanner.nextLine();

        int age = current_year - Integer.parseInt(date_of_birth);

        return "So you are " + age + " years old !";
    }


}
