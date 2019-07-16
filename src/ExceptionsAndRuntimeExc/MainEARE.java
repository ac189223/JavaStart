package ExceptionsAndRuntimeExc;

public class MainEARE {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

//        if (b != 0) {System.out.println(a / b);}


        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Division by 0");
        }

        System.out.println("");

        System.out.println(divide(7345,688));                // With usage of below method A
        System.out.println(divide(6,0));                    // With usage of below method A

        System.out.println("");

        try {
            System.out.println(divideWithExc(7345, 688));           // With usage of next method B
        } catch (ArithmeticException e) {
            System.out.println("Division by 0");
        }

        try {
            System.out.println(divideWithExc(6, 0));               // With usage of next method B
        } catch (ArithmeticException e) {
            System.out.println("Division by 0");
        }

        System.out.println("");

    }
                                                         // Method A
    public static int divide(int a, int b) {          // Must return double so gives 0 from catch
        try {
            return (a / b);
        } catch (ArithmeticException e) {
            System.out.println("Division by 0");
            return 0;
        }
    }
                                                // Method B
                                                // Returns double OR exc which we will analyze later
    public static int divideWithExc(int a, int b) throws ArithmeticException {
        return a / b;
    }

}
