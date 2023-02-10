package dev.lpa;

public class SIBTest {
    public static final String owner;

    static {
        owner = "trong";
        System.out.println("SIBTest static initialization block called");
    }
    public SIBTest()
    {
        System.out.println("SIB constructor called ");
    }
    static
    {
        System.out.println("2nd initialization block called");
    }
    public void sameMethod()
    {
        System.out.println("SomeMethod called");
    }
}
