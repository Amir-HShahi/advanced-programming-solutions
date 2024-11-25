public class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * 3.14;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }
    
}
