public class Main {
    public static void main(String[] args) {
        int current_year = 2022;
        System.out.println(getInputFromConsole(current_year));
        System.out.println(getInputFromScanner(current_year));
    }
    public static String getInputFromConsole(int current_year)
    {
        String name = System.console().readLine("Hi, What's your name ?: ");
        System.out.println("Hi " + name + ", Thanks for talking the course !");
        String date_of_birth = System.console().readLine("What year were you born ?: ");
        int age = current_year - Integer.parseInt(date_of_birth);   // Double.pareDou();
        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int current_year)
    {
        return "";
    }
}
