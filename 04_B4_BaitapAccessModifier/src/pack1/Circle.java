package pack1;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    double getArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

}
