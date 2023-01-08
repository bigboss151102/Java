public class MethodOverLoadingChallenge {
    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + ConvertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + ConvertToCentimeters(68) + "cm");
    }
    public static double ConvertToCentimeters(int inches){
        return inches * 2.54;
    }
    public static double ConvertToCentimeters(int feet, int inches){
        int feet_to_inches = feet * 12;
        int total_inches = feet_to_inches + inches;
        double result = ConvertToCentimeters(total_inches);
        return result;
    }
}
