public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(75.114);
    }
    public static long toMilesPerHour(double kilometPerHour){
        double result;
        long result_round;
        if (kilometPerHour < 0){
            return -1;
        }else {
            result = kilometPerHour / 1.609;
            result_round = Math.round(result);
        }
        return result_round;
    }
    public static void printConversion(double kilometPerHour){
        if (kilometPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milePerHour = toMilesPerHour(kilometPerHour);
            System.out.println(kilometPerHour + " km/h " + " = " + milePerHour + " mi/h ");
        }
    }
}
