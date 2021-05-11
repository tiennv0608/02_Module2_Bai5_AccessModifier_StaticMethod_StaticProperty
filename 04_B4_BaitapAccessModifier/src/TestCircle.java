public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The radius is: " + circle1.getRadius());
        System.out.println("The Area is: " + circle1.getArea());

        Circle circle2 = new Circle(10);
        System.out.println("The radius is: " + circle2.getRadius());
        System.out.println("The Area is: " + circle2.getArea());

    }
}
