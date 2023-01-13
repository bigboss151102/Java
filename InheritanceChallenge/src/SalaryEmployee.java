public class SalaryEmployee extends Employee{
    double annualSalary;
    boolean isRetired;

    public SalaryEmployee(String name, String birthDate, String hireDate,
                          double annualSalary)
    {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }
    @Override
    public double collectPay()
    {
        double paycheck = annualSalary / 26;
        double adjusted = (isRetired) ? 0.9 * paycheck : paycheck;
        return  (int)adjusted;
    }

    public void retire()
    {
        terminate("12/12/2025");
        isRetired = true;
    }



}
