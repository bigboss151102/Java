package dev.lpa;

public class Main {
    public static void main(String[] args) {
//        SomeClass one = new SomeClass("one");
//        SomeClass two = new SomeClass("two");
//        SomeClass three = new SomeClass("three");
//
//        System.out.println(one.getInstanceNumber());
//        System.out.println(two.getInstanceNumber());
//        System.out.println(three.getInstanceNumber());
//
//        int pw = 674321;
//        Password password = new ExtendedPassword(pw);
//        password.storePassword();
//        password.letMeIn(52366);
//        password.letMeIn(674321);
        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.sameMethod();;
        System.out.println("Owner is " + SIBTest.owner);
    }
}
