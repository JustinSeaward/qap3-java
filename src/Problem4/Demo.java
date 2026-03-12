package Problem4;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args){
        ArrayList<Shape> Shapes = new ArrayList<Shape>();

        Circle circle1 = new Circle("Circle", 10);
        Ellipse ellipse1 = new Ellipse("Ellipse", 5,10);
        Triangle triangle1 = new Triangle("Triangle", 10, 8, 6);
        EquilateralTriangle et1 = new EquilateralTriangle("Equilateral Triangle", 20,20,20);

        Shapes.add(circle1);
        Shapes.add(ellipse1);
        Shapes.add(et1);
        Shapes.add(triangle1);

        // Test code to see if the validation will work and stop the program.
        //        EquilateralTriangle et2 = new EquilateralTriangle("Equilateral Triangle", 20,30,20);
        //       Shapes.add(et2);


        System.out.println();
        System.out.println("****** Before scaling ******");

        for (Shape shape: Shapes){
            System.out.println("Name: " + shape.getName() + ", Area: " + shape.getArea() + ", Perimeter: " + shape.getPerimeter());
        }
        System.out.println();
        System.out.println("****** After scaling by 2 ******");
        for (Shape shape: Shapes){
            shape.scale(2);
            System.out.println("Name: " + shape.getName() + ", Area: " + shape.getArea() + ", Perimeter: " + shape.getPerimeter());
        }
    }
}