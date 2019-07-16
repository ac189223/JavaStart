package ThisMethod_Point;

import java.util.Arrays;
import java.util.Comparator;

public class Main_TM_P {

    private int t1 = 123;
    private int order = -1;   // 1 for ASC and -1 for DESC

    public static void main(String[] args) {

        Point_TM_P punkt = new Point_TM_P(4,4);
        punkt.setPunkt(5,6);
        System.out.println("In MainAOF class: x = " + punkt.x + ", y = " + punkt.y);

        Point_TM_P.InnerClass InnerClass = punkt.new InnerClass();
        System.out.println(InnerClass);

        // Declaration of new instance
        Main_TM_P main = new Main_TM_P();
        main.run();

    }

    private void run() {

        String[] t = {"First", "Second", "Third", "Fourth", "Fifth"};

        Comparator<String> comparator = new Comparator<String>() {

            @Override
            public int compare(String t1, String t2) {
                System.out.println(Main_TM_P.this.t1);           // Calling variable from other place
                return Main_TM_P.this.order * (t1.length() - t2.length());
            }
        };

        Arrays.sort(t, comparator);

        System.out.println(Arrays.toString(t));
    }





}
