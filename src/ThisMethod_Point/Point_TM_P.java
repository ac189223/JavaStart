package ThisMethod_Point;

public class Point_TM_P {

    int x;
    int y;

    public Point_TM_P(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setPunkt(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(this);
        System.out.println("Inside class Point_TM_P: x = " + this.x + ", y = " + this.y);
    }

    public class InnerClass {
        private int x = 100;
        @Override
        public String toString() {
            return "I am InnerClass of Point_TM_P. I am in: " + Point_TM_P.this.x + " " + y;
        }
    }


//    @Override
//    public String toString() {
//        return "Inside class Point_TM_P";
//    }

}

