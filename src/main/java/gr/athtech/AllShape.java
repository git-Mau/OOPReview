package gr.athtech;

import java.util.ArrayList;

public class AllShape {

    ArrayList<Shape> shapes;

//    Aggregation
//    public AllShape(ArrayList<Shape> shapes) {
//        this.shapes = shapes;
//    }

//    Composition
    public AllShape(){
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    // try catch in place
//    public void removeShape(Shape s) {
//        try {
//            if (!shapes.contains(s)) {
//                throw new ShapeIsNotContainedException("Shape is not contained in the shapes list");
//            }
//            shapes.remove(s);
//        } catch (ShapeIsNotContainedException e){
//            System.out.println(e.getMessage());
//        }
//    }


    // handle in main - in the method that call me
    public void removeShape(Shape s) throws ShapeIsNotContainedException{
            if (!shapes.contains(s)) {
                throw new ShapeIsNotContainedException("Shape is not contained in the shapes list");
            }
            shapes.remove(s);
    }

    public void printAllArea() {
        for(Shape s : shapes){
            System.out.println(s);
        }
    }
}
