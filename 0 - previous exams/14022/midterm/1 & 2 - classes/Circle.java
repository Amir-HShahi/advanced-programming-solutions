public class Circle extends Shape implements Drawable {
    private int r = 1;

    @Override
    public void draw() {
    }

    @Override
    public double perimeter() {
        return 2 * r * 3.14;
    }

}
