class Point {
    int x,y,z ;

    //this is a constructor
    Point(int x_, int y_, int z_) {
        x = x_;
        y = y_;
        z = z_;
    }

    double distance(Point p) {
        return Math.sqrt(Math.pow(x - p.x,2) + Math.pow(y - p.y, 2) + Math.pow(z - p.z, 2));
    }

    String dotToString(){
        return x + " " + y + " " + z;
        // self.x
    }
}

public class SquareRoot {
    public static double sqrt(double a) {
        double x = a/2;
        double eps = 4*Math.ulp(a);

        while (Math.abs(x*x - a) >= eps) {
            x = (a/x + x)/2;
            System.out.println(x);
        }
        return (x);
    }
    public static void main(String[]args) {
        //System.out.println(sqrt(9));
        int x;
        Point point1 = new Point(1,2,3), point2 = new Point(66,66,66);

        System.out.println("Point 1 is: " + point1.dotToString()); //the first parameter gives the data source
        System.out.println("Point 2 is: " + point2.dotToString());
        System.out.println("The distance between points is %2f\n" + point1.distance(point2));
    }
}
