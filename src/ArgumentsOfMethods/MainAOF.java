package ArgumentsOfMethods;

public class MainAOF {

    public static void main(String[] args) {
        MainAOF main = new MainAOF();
        main.run();
    }


    private void run() {
        int a = 1;
        int b = 2;
        int c = 3;
        int result = add(a,b,c);
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        result = addTable(a,b,c,a,b,c,a,b,c,a,b,c);
        System.out.println(result);
    }

    private int addTable(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }


    private int add(final int a, int b, int c) {
        // a=10;
        return a+b+c;
    }


}
