public class Square extends Quadrilateral {
    public Square(double sideSize) {
        super(sideSize, sideSize, sideSize, sideSize);
    }

    @Override
    public double calculateArea() {
        return this.top * this.top;
    }
}
