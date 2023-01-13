public class Main {
    public static void main(String[] args) {
        Employee tim = new Employee("Trong", "15/11/2002", "15/11/2025");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        System.out.println("--------------------------------");

        Employee joe = new Employee("Joe", "11/11/1990", "03/03/2020");
        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Pay = " + joe.collectPay());

        System.out.println("--------------------------------");

        SalaryEmployee Trong = new SalaryEmployee("Trong", "19/11/2002",
                "04/05/2022", 35000);
        System.out.println(Trong);
        System.out.println("Trong's Paycheck = " + Trong.collectPay() + " $");
        Trong.retire();
        System.out.println("Joe's Pension check = " + Trong.collectPay() + " $");

        System.out.println("--------------------------------");


        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970",
                "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = " + mary.collectPay() + " $");
        System.out.println("Mary's Holiday Pay = " + mary.getDoublePay() + " $");

        System.out.println("--------------------------------");
    }
}
