public class Hello {
    public static void main(String[] args){
        System.out.println("Hello Trong !");

        boolean isTrong = false;
        if (!isTrong){
            System.out.println("It is not an Trong !");
            System.out.println(("And I am scared of Trong !"));
        }

        int top_score = 80;
        if(top_score < 100)
        {
            System.out.println("You got the high score !");
        }

        int second_top_score = 80;
        if (top_score > second_top_score && top_score < 100)
        {
            System.out.println("Greater then second top score and less than 100");
        }

        if ((top_score > 90) || (second_top_score <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if (isDomestic){
            System.out.println("This car is domestic to our country !");
        }
        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double my_first_value = 20.00d;
        double my_second_value = 80.00d;
        double my_value_total = (my_first_value + my_second_value) * 100.00d;
        System.out.println("MyValueTotal = " + my_value_total);
        double the_remainder = my_value_total % 40.00d;
        System.out.println("The Remainder = " + the_remainder);
        boolean is_noremainder = (the_remainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + is_noremainder);
        if (!is_noremainder){ // nếu không phải là true
            System.out.println("Got some remainder !");
        }
    }
}
