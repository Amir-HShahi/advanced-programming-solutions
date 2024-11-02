import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter phone " + (i + 1) +  " name : ");
            String name = scanner.nextLine();

            System.out.print("Enter phone " + (i + 1) + " imei: ");
            int imei = scanner.nextInt();
            scanner.nextLine();

            OrangePhone phone = new OrangePhone(name, imei);
            System.out.println(phone);
        }
        scanner.close();

    }
}
