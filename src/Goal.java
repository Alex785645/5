import java.time.LocalDate;

public class Goal {
    private LocalDate date;
    private String name;
    private int bonus;

    public Goal(int year, int month, int dayOfMonth, String name, int bonus) {
        this.date = LocalDate.of(year, month, dayOfMonth);
        this.name = name;
        this.bonus = bonus;
    }

    public boolean isAchievedInCurrentMonth(LocalDate currentDate) {
        return currentDate.getMonth() == date.getMonth() &&
                currentDate.getYear() == date.getYear();
    }

    public int getBonus() {
        return bonus;
    }
}
