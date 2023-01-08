public class BarkingDog {
    public static void main(String[] args) {
        boolean a = ShouldWakeUp(true, -1);
        System.out.println(a);
    }
    public  static boolean ShouldWakeUp(boolean barking, int hour_of_day){
        if (barking == false){
            return false;
        } else if (hour_of_day < 0 || hour_of_day > 23) {
            return  false;
        } else {
            if (hour_of_day < 8 || hour_of_day > 22) {
                return true;
            }else {
                return false;
            }
        }
    }
}
