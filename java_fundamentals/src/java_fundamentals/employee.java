package java_fundamentals;

public class employee extends person {
    private double annualSalary;
    private int yearStarted;
    private String nationalInsuranceNumber;

    // Constructor
    public employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name); // Call to superclass constructor (Person)
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Getters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    // Setters
    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // toString method to display employee details
    @Override
    public String toString() {
        return "Employee Details:\n" +
               "Name: " + getName() + "\n" +
               "Annual Salary: ₹" + annualSalary + "\n" +
               "Year Started: " + yearStarted + "\n" +
               "National Insurance Number: " + nationalInsuranceNumber;
    }
}