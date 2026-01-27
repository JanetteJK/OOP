public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color, double width, double height){
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = width * height;
        return super.calculateArea() + area;
    }
    @Override
    public String toString(){
        return "The area of rectangle with width of " + width + " and height of " + height + " is: " + calculateArea();
    }
}
