package ReferencesTest;

public class ReferencesTest {

    static void method1(Variable z) {
        z.x = -1;
        z = null;
    }

    static void method2(final Variable z) {
        z.x = -2;
    }

    public static void main(String[] args) {

        Variable a = new Variable(1);
        final Variable b = new Variable(2);

        //instruction 1
        method1(a);
        System.out.print(a.x+" ");
        //instruction 2
        method1(b);
        System.out.print(b.x+" ");

        Variable c = new Variable(1);
        final Variable d = new Variable(2);

        //instruction 3
        method2(c);
        System.out.print(c.x+" ");
        //instruction 4
        method2(d);
        System.out.print(d.x+" ");

    }
}

