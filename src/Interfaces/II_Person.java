package Interfaces;

import java.io.Serializable;

@II_SuperClass
public class II_Person implements Comparable<II_Person>, Runnable, Serializable {

    private String name;

    // Alt + Insert
    // Constructor
    public II_Person(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Must implement methods below because group implements interface
    @Override
    public int compareTo(II_Person person) {
        return 0;
    }

    @Override
    public void run() {

    }
}

