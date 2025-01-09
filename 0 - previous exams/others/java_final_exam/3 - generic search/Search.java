public class Search {
    public static <E extends Comparable<E>> E[] sort(E[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if ((array[j].compareTo(array[j + 1])) > 0) {
                    E temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
