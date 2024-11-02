import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyArray array = new MyArray();

        System.out.println("Type end to exit");

        while (true) {
            System.out.print("Enter integer value: ");
            String inputString = scanner.nextLine();

            if (inputString.toLowerCase().trim().equals("end"))
                break;

            int input = Integer.parseInt(inputString);
            array.add(input);
        }

        System.out.println("Max: " + array.getMaxElement());
        for (int integer : array.reverse()) {
            System.out.println(integer);
        }
        scanner.close();
    }
}
