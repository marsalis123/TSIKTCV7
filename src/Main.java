public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);
        Shape rectangle = new Rectangle(3.0, 6.0);

        System.out.println(circle.getAttributes());
        System.out.println(square.getAttributes());
        System.out.println(rectangle.getAttributes());
    }
}