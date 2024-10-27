public class Array {
    public static int getMaxElement(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) 
            if (array[i] > max) 
                max = array[i];
            
        return max;
    }
}
