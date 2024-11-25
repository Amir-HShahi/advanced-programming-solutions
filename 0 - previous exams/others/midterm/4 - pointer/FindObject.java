public class FindObject {
    public boolean search(Object key, Object[] array) {
        for (Object object : array) {
            if (object == key) {
                return true;
            }
        }
        return false;
    }
}
