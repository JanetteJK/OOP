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
        System.out.println(sqrt(9));
    }
}
