public class Main {
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
        switch (switch_value){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was a 3, 4, 5");
                System.out.println("Actually it was a " + switch_value);
                break;
            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
        }
    }
}
