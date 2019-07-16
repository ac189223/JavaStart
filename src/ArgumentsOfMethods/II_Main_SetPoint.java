package ArgumentsOfMethods;

public class II_Main_SetPoint {

    public static void main(String[] args) {

        II_PointOldStyle point = new II_PointOldStyle();
        point.coordX = 10;
        point.coordY = 20;
        System.out.println("Starting coordinates of point are (" + point.coordX + "," + point.coordY + ").");

        point.setX(7);
        point.setY(5);
        System.out.println("Coordinates after change are (" + point.giveX() + "," + point.giveY() + ").");

        System.out.println("Sum of coordinates is " + point.sumXY() + ".");
        System.out.println("Sum of coordinates for point (17,4) equals " + point.sumXYmod(17,4) + ".");

        point.increaseXY(10);

        II_PointWithConstructor nextPoint = new II_PointWithConstructor(15, 30);
        System.out.println("Coordinates of a point created with constructor are (" + nextPoint.giveX() + "," + nextPoint.giveY() + ").");

        II_PointWithConstructor nextNextPoint = new II_PointWithConstructor(nextPoint);
        System.out.println("Coordinates of a point created with 2nd constructor (copy method) are also (" + nextNextPoint.giveX() + "," + nextNextPoint.giveY() + ").");
    }


}
