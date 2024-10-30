public class MyArray {
    private int length = 0;
    private int[] array = new int[0];

    public void add(int element) {
        int[] newArray = new int[length + 1];
        for (int i = 0; i < length; i++) {
            newArray[i] = array[i];
        }
        newArray[length] = element;
        array = newArray;
        length++;
    }

    public int getMaxElement() {
        int max = 0;
        if (length > 0)
            max = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];

        return max;
    }

    public int[] reverse() {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = array[array.length - i - 1];
        }
        array = reversedArray;
        return array;
    }

    @Override
    public String toString() {
        String arrayAsString = "[";
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                arrayAsString += array[i] + "]";
                break;
            }
            arrayAsString += array[i] + ",";
        }
        return arrayAsString;
    }
}
