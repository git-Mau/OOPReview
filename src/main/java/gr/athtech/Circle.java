package gr.athtech;

public class Circle implements Shape {

    private final static double PI = 3.14;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 2 * PI * radius * radius;
        // Math.pow(radious, 2);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
