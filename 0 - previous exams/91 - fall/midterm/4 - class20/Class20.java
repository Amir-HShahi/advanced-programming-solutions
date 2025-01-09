public class Class20 {
    // this field must be declared as private
    private static int objectCount = 0;

    // constructor must be declared as private
    private Class20() {
        objectCount++;
    }

    // this method must be declared as static
    public static Class20 createObject() {
        if (objectCount < 20) {
            return new Class20();
        } else {
            return null;
        }
    }
}
