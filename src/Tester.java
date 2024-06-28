import java.util.ArrayList;
import java.util.List;

public class Tester extends Employee {
    private List<String> testTypes = new ArrayList<>();

    public Tester(String firstName, String lastName, String address, String email, String pesel, int employmentYear) {
        super(firstName, lastName, address, email, pesel, employmentYear);
    }

    public void addTestType(String testType) {
        testTypes.add(testType);
    }

    @Override
    public int calculateBaseSalary() {
        int baseSalary = 3000;
        baseSalary += testTypes.size() * 300; // Each test type gives 300 bonus
        return baseSalary;
    }
}
