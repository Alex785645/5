import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee {
    private List<Technology> knownTechnologies = new ArrayList<>();

    public Developer(String firstName, String lastName, String address, String email, String pesel, int employmentYear) {
        super(firstName, lastName, address, email, pesel, employmentYear);
    }

    public void addTechnology(Technology technology) {
        knownTechnologies.add(technology);
    }

    @Override
    public int calculateBaseSalary() {
        int baseSalary = 3000;
        for (Technology tech : knownTechnologies) {
            baseSalary += tech.getBonus();
        }
        return baseSalary;
    }
}
