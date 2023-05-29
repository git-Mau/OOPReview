package gr.athtech;

import java.util.ArrayList;

public class ShapesProgram {
    public static void main(String[] args) {
//      Aggregation
//        AllShape allShape = new AllShape(new ArrayList<Shape>());

//        Composition
        AllShape allShape = new AllShape();

        Rectangle rectangle1 = new Rectangle(5, 9);
        Rectangle rectangle2 = new Rectangle(12, 5);
        Circle circle = new Circle(5.6);

        allShape.addShape(rectangle1);
        allShape.addShape(rectangle2);
        allShape.addShape(circle);


        try {
            allShape.removeShape(circle);
        } catch (ShapeIsNotContainedException e){
            System.out.println(e.getMessage());
        }

        allShape.printAllArea();

    }
}