public class MyArrayList {
    private int length = 0;
    private Object[] array = new Object[10];

    public void add(Object element) {
        ensureCapacity();
        array[length++] = element;
    }

    private void ensureCapacity() {
        if (length == array.length) {
            Object[] newArray = new Object[array.length * 2];
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = this.array[i];
            }
            array = newArray;
        }
    }

    public Object get(int index) {
        return array[index];
    }

    public void remove(int index) {
        for (int i = index; i < length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[--length] = null;
    }
}