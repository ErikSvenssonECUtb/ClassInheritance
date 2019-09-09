package se.ecutb.erik;



import se.ecutb.erik.model.Shape;
import se.ecutb.erik.model.Square;
import se.ecutb.erik.model.Triangle;

public class App
{
    public static void main( String[] args )
    {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Square(4,6);
        shapes[1] = new Triangle(4,6);
        shapes[2] = new Triangle(2,8);
        shapes[3] = new Square(10,45);
        shapes[4] = new Triangle(2,11);

        for(Shape object : shapes){
            System.out.println(object);
        }
    }
}
