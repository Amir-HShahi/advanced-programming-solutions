public class MyArray {
    private int length = 0;
    private int[] array = new int[0];

    /**
     * First creates new array to replace with previous array,
     * Then copies previous array elements to new array,
     * finally adds the argument element to new array
     * 
     * @param element the {@code integer} value to add to array
     */
    public void add(int element) {
        int[] newArray = new int[length + 1];
        for (int i = 0; i < length; i++) {
            newArray[i] = array[i];
        }
        newArray[length] = element;
        array = newArray;
        length++;
    }

    /**
     * @return the {@code integer} value of maximum element of array
     */
    public int getMaxElement() {
        int max = 0;
        if (length > 0)
            max = array[0];
        for (int i = 1; i < array.length; i++)
            if (array[i] > max)
                max = array[i];

        return max;
    }

    /**
     * reverses array and replaces with previous array
     * 
     * @return the {@code int[]} reversed array
     */
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
        if (length == 0)
            return "[]";

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
