package ExtendingClasses;

public class Doctor extends Employee {

    private double bonus;

    public Doctor(String name, String surname, double payment) {
        super(name, surname, payment);
        bonus = 0;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

