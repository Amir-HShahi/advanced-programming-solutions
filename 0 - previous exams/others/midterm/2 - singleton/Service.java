public class Service {
    // this field must be declared as private
    private static int objectCount = 0;

    // constructor must be declared as private
    private Service() {
        objectCount++;
    }

    // this method must be declared as static
    public static Service createObject() {
        if (objectCount == 0) {
            return new Service();
        } else {
            return null;
        }
    }
}
