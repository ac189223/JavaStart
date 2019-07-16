package MultiArgOfMethods_Calculator;

public class Calculator {

    int addition(int... addNumbers) {
        int sum =0;
        for (int addNumber : addNumbers) {
            sum += addNumber;
        }
        return sum;
    }

    String product(int... prodNumbers) {
        long prod = 1;
        int howMany = 0;
        System.out.println("");
        System.out.println("Partial results of multiplication:");
        boolean outOfRange = false;
        for (int prodNumber : prodNumbers) {
            if ((prod * prodNumber) > prod) {
                prod *= prodNumber;
                howMany++;
                System.out.println(prod);
            } else {
                System.out.println("We must stop here! It went out of range.\n" +
                        "We manage to multiply " + howMany + " numbers out of " + prodNumbers.length + ".");
                outOfRange = true;
                break;
            }
        }
        if (outOfRange) {
            return "";
        } else {
            return "The result of multiplication is " + prod + ".";
        }
    }

  //  public double division() {}







}
