public class Rectangle extends Quadrilateral {
    public Rectangle(double width, double height) {
        super(width, width, height, height);
    }    

    @Override
    public double calculateArea() {
        return this.right * this.bottom;
    }
}
