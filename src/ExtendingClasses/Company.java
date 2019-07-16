package ExtendingClasses;

public class Company {


    public static void main(String[] args) {

        Employee emp1 = new Employee("Jane", "Dickens", 3000);
        System.out.println(emp1.name + " " + emp1.surname + " earns " + emp1.payment + ".");

        Manager man1 = new Manager();
        man1.name = "Robert";
        man1.surname = "McCormick";
        man1.payment = 6000;
        man1.bonus = 3000;
        System.out.println("Manager " + man1.name + " " + man1.surname + " earns " + man1.payment + " but additionally has a chance for " + man1.bonus + " bonus.");

        Manager man2 = new Manager("Sandra", "Dermont", 4000, 7000);
        System.out.println("Manager " + man2.name + " " + man2.surname + " earns just " + man2.payment + " but has a chance for a bigger bonus of " + man2.bonus + ".");

        Nurse nur1 = new Nurse("Asia","Kowalska",2000);
        nur1.setOverHours(25);
        System.out.println("Nurse " + nur1.name + " " + nur1.surname + " earns just " + nur1.payment + " but has a chance for a lot of over-hours (starting now with " + nur1.getOverHours() + "h).");

        Doctor doc1 = new Doctor("John", "Collins", 4500);
        doc1.setBonus(6000);
        System.out.println("Doctor " + doc1.name + " " + doc1.surname + " earns " + doc1.payment + " but received this month a nice " + doc1.getBonus() + " for saving some humans.");


    }

}
