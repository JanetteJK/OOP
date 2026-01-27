public class Shape {
    private double area;
    private String color;

    public Shape(String color){
        area = 0;
        this.color = color;
    }
    public double calculateArea(){
        return area;
    }

    public String toString(){
        return "(" + calculateArea() + ")";
    }
    public String getColor(){
        return " and it is " + color;
    }
}
