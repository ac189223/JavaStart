package ExtendingClasses;

public class Employee {

    String name;
    String surname;
    double payment;

    //Constructor (basic)
    public Employee(){ this("", "", 0); }                   // Instead of traditional version
//    public Employee() {
//        name = "";
//        surname = "";
//        payment = 0;
//    }

    //Constructor (with data)
    public Employee(String n, String s, double p) {
        name = n;
        surname = s;
        payment = p;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getPayment() {
        return payment;
    }
}

