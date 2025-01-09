import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Formatter;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(666);
            Socket client = server.accept();
            Scanner scanner = new Scanner(client.getInputStream());
            System.out.println(scanner.nextLine());
            Formatter formatter = new Formatter(client.getOutputStream());
            formatter.format("Welcome\n");
            formatter.flush();
            scanner.close();
            formatter.close();
            server.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
