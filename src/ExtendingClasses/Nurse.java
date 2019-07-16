package ExtendingClasses;

public class Nurse extends Employee {

    private int overHours;

    public Nurse(String name, String surname, double payment) {
        super(name, surname, payment);
        overHours = 0;
    }

    public int getOverHours() {
        return overHours;
    }

    public void setOverHours(int overHours) {
        this.overHours += overHours;
    }
}

