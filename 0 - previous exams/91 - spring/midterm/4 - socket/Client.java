import java.io.IOException;
import java.net.Socket;
import java.util.Formatter;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket client = new Socket("localhost", 666);
            Formatter formatter = new Formatter(client.getOutputStream());
            formatter.format("hello\n");
            formatter.flush();
            Scanner scanner = new Scanner(client.getInputStream());
            System.out.println(scanner.nextLine());
            scanner.close();
            client.close();
            formatter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
