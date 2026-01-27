public class Circle extends Shape{
    private double radius;


    public Circle(String color, double radius){
        super(color);
        this.radius = radius;

    }

    @Override
    public double calculateArea() {
        double area = Math.pow(radius,2) * Math.PI;
        return super.calculateArea() + area;
    }
    @Override
    public String toString(){
        return "The area of circle with radius of " + radius + " is: " + calculateArea();
    }
}
