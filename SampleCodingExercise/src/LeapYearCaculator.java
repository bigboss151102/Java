public class LeapYearCaculator {
    public static void main(String[] args) {
        boolean result = IsLeapYear(1600);
        System.out.println(result);
        result = IsLeapYear(2000);
        System.out.println(result);
        result = IsLeapYear(2400);
        System.out.println(result);
        result = IsLeapYear(1700);
        System.out.println(result);
        result = IsLeapYear(1800);
        System.out.println(result);
    }
    public  static boolean IsLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        }else {
            if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
                return true;
            }else {
                return false;
            }
        }
    }
}
