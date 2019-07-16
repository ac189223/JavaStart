package ArgumentsOfMethods;

public class MainPoint {

    public static void main(String[] args) {
        MainPoint main = new MainPoint();
        main.run();
    }


    private void run() {
        Point point = new Point();
        point.x = 10;
        point.y = 100;

        changeNot(point);
        System.out.println(point.x);
        System.out.println(point.y);

        change(point);
        System.out.println(point.x);
        System.out.println(point.y);
    }

    private void changeNot(Point p) {
        p = new Point();
        p.x = 99;
        p.y = 99;
    }

    private void change(Point p) {
        p.x = 99;
        p.y = 99;
    }

}
