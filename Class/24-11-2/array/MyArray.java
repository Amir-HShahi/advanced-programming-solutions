public class MyArray {
    private int length = 0;
    private int[] array = new int[0];

    public void add(int element) {
        int[] newArray = new int[length + 1];
        for (int i = 0; i < length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = element;
        array = newArray;
        length++;
    }

    public int getMaxElement() {
        int max = 0;
        if (length > 0)
            max = array[0];

        for (int i = 0; i < array.length; i++)
            if (array[i] > max)
                max = array[i];

        return max;
    }

    public int[] reverse() {
        int[] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[(array.length - 1) - i];
        }
        array = newArray;
        return array;
    }

}