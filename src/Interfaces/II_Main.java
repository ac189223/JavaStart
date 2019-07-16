package Interfaces;

import java.util.Comparator;

public class II_Main {

    public static void main(String[] args) {

        // Comparator that compares ascending

        Comparator<II_Person> comparator = new Comparator<II_Person>() {
            @Override
            public int compare(II_Person p1, II_Person p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };

        // Inbuilt function of comparator - reversed sorting

        Comparator<II_Person> reversed = comparator.reversed();

        II_Person p1 = new II_Person("Ala");
        II_Person p2 = new II_Person("Kasia");
        II_Person p3 = new II_Person("Maciek");
        II_Person p4 = new II_Person("Bartek");
        II_Person p5 = new II_Person("Magda");
        II_Person p6 = new II_Person("Konrad");
        II_Person p7 = new II_Person("Zenon");
        II_Person p8 = new II_Person("Albert");


    }
}

