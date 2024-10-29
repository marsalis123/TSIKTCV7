public class Square implements Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String getAttributes() {
        return "Square with side length: " + sideLength;
    }
}