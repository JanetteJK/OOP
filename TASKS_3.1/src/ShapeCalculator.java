import java.util.ArrayList;

public class ShapeCalculator {
    public static void main(String[]args){

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("Black",2));
        shapes.add(new Rectangle("red",2.0,4.5));
        shapes.add(new Triangle("Pink",1,3.2,1.6));
        shapes.add(new Circle("Blue", 4.8));

        for (Shape shape : shapes){
            System.out.println(shape.toString() + shape.getColor() );
        }



    }
}
