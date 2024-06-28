import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private List<Goal> goals = new ArrayList<>();

    public Manager(String firstName, String lastName, String address, String email, String pesel, int employmentYear) {
        super(firstName, lastName, address, email, pesel, employmentYear);
    }

    public void addGoal(Goal goal) {
        goals.add(goal);
    }

    @Override
    public int calculateBaseSalary() {
        int baseSalary = 3000;
        LocalDate currentDate = LocalDate.now();
        for (Goal goal : goals) {
            if (goal.isAchievedInCurrentMonth(currentDate)) {
                baseSalary += goal.getBonus();
            }
        }
        return baseSalary;
    }
}
