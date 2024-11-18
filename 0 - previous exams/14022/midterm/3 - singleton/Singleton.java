public class Singleton {
    // this field must be declared as private
    private static int objectCount = 0;

    // constructor must be declared as private
    private Singleton() {

    }

    // this method must be declared as static
    public static Singleton createObject() {
        if (objectCount == 0) {
            Singleton object = new Singleton();
            objectCount++;
            return object;
        } else {
            return null;
        }
    }
}
