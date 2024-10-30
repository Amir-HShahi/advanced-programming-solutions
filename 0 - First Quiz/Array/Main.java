import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int length = scanner.nextInt();

        MyArray array = new MyArray();
        for (int i = 0; i < length; i++) {
            System.out.print("Enter integer element: ");
            int input = scanner.nextInt();
            array.add(input);
        }

        System.out.println("Array: " + array);
        array.reverse();
        System.out.println("Reversed array: " + array);
        System.out.println("Max element: " + array.getMaxElement());
        scanner.close();
    }
}
