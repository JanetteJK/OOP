public class Triangle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, double side1_, double side2_, double side3_){
        super(color);
        this.side1 = side1_;
        this.side2 = side2_;
        this.side3 = side3_;
    }

    @Override
    public double calculateArea() {
        double area = (side1 + side2 + side3) / 2;
        return super.calculateArea() + area;
    }
    @Override
    public String toString(){
        return "The area of triangle with side lenghts of " + side1 + ", " + side2 + " and " + side3 + " is: " + calculateArea();
    }


}
