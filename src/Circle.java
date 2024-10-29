public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getAttributes() {
        return "Circle with radius: " + radius;
    }
}