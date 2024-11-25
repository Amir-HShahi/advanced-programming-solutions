public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Square(2), new Cube(3)};
        printAreaOrVolume(shapes);
    }

    public static void printAreaOrVolume(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof TwoDimensionalShape) {
                System.out.println(shapes[i].getArea());
            } else {
                System.out.println(shapes[i].getArea() + "-" + ((ThreeDimensionalShape) shapes[i]).getVolume());
            }
        }
    }
}
