public class main1 {
    public static void main(String[] args) {
       /* int value = 3;
        if (value == 1){
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        }else {
            System.out.println("Value was not 1 or 2");
        }*/
        int switch_value = 3;
        switch (switch_value) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Value was a 3, 4, 5");
                System.out.println("Actually it was a " + switch_value);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }
        String month = "AAAA";
        System.out.println(month + " is in the " + getQuater(month) + " quarter");
    }
    public static String getQuater(String month){
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULy", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String bad_response = month + " is bad";
                yield bad_response;
            }
        };
    }

}
