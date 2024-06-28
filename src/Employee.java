import java.time.Year;

public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String address;
    protected String email;
    protected String pesel;
    protected int employmentYear;

    public Employee(String firstName, String lastName, String address, String email, String pesel, int employmentYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.employmentYear = employmentYear;
    }

    public abstract int calculateBaseSalary();

    public int calculateSalary() {
        int baseSalary = calculateBaseSalary();
        int yearsWorked = Year.now().getValue() - employmentYear;
        return baseSalary + (yearsWorked * 1000);
    }

    // Getters and setters for common fields
    // (omitted for brevity)
}
