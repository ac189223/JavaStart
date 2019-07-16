package ExtendingClasses;

public class Manager extends Employee {

    double bonus;

    public Manager(){ this("", "", 0,0); }
//    public Manager() {
//        name = "";
//        surname = "";
//        payment = 0;
//        bonus = 0;
//    }

    public Manager(String n, String s, double p, double b) {
        name = n;
        surname = s;
        payment = p;
        bonus = b;
    }

}

//Class Manager (child) extends class Employee (parent).
//
//Inherits all 3 fields.
//Additionally has field bonus.
//
//Has it's own constructors
