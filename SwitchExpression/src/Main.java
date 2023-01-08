public class Main {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);

    }
    public static void printDayOfWeek(int day){
        String day_of_week = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(day + " stands for " + day_of_week);
    }
    public static void printWeekDay(int day){
        String day_of_week = "Invalid Day";
        if (day == 0){
            day_of_week = "Sunday";
        } else if (day == 1) {
            day_of_week = "Monday";
        } else if (day == 2) {
            day_of_week = "Tuesday";
        } else if (day == 3) {
            day_of_week = "Wednesday";
        } else if (day == 4) {
            day_of_week = "Thursday";
        } else if (day == 5) {
            day_of_week = "Friday";
        } else if (day == 6){
            day_of_week = "Saturday";
        }else {
            System.out.println("Invalid Day");
        }
        System.out.println(day + " stands for " + day_of_week);
    }
}
