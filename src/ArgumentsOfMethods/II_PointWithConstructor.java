package ArgumentsOfMethods;

public class II_PointWithConstructor {

    int coordX;
    int coordY;

    //Constructor (regular)
    public II_PointWithConstructor() {
        coordX = 0;
        coordY = 0;
    }


    //Constructor (co-ordinates)
    public II_PointWithConstructor(int a, int b) {
        coordX = a;
        coordY = b;
    }

    //Constructor (copy)
    public II_PointWithConstructor(II_PointWithConstructor pt) {
        coordX = pt.coordX;
        coordY = pt.coordY;
    }

    void setX(int x) {
        coordX = x;
    }

    void setY(int y) {
        coordY = y;
    }

    int giveX() {
        return coordX;
    }

    int giveY() {
        return coordY;
    }
    int sumXY() {
        return coordX + coordY;
    }
    int sumXYmod(int X, int Y) {
        return X+Y;
    }

    void increaseXY(int howMuch) {
        int incrX = coordX + howMuch;
        int incrY = coordY + howMuch;
        System.out.println("Coordinates after moving the point with " + howMuch + " on both axes (" + incrX + "," + incrY + ").");
        increaseXYSlow(incrX, incrY);
    }

    void increaseXYSlow(int startX, int startY) {
        int incrX = ++startX;
        int incrY = ++startY;
        System.out.println("After next move we have a point (" + incrX + "," + incrY + ").");
    }
}
