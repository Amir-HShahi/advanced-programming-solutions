public abstract class Quadrilateral extends Shape{
    protected double top, bottom, left, right;

    public Quadrilateral(double top, double bottom, double left, double right) {
        this.top = top;
        this.bottom = bottom;
        this.left = left;
        this.right = right;
    }

    public double calculatePerimeter() {
        return this.top + this.bottom + this.left + this.right;
    }
}
