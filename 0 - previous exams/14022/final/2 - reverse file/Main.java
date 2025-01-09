import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("c1.txt")) {
            ArrayList<Character> input = new ArrayList<Character>();
            int character;
            while (-1 != (character = fr.read())) {
                input.add((char) character);
            }

            ArrayList<Character> output = new ArrayList<Character>();
            
            for (int i = input.size() - 1; i >= 0; i--) {
                output.add(input.get(i));
            }

            String out = "";
            for (Character eachChar : output) {
                out += eachChar;
            }

            Formatter formatter = new Formatter(new FileOutputStream("c2.txt"));
            formatter.format(out);
            formatter.flush();
            formatter.close();
            
            
            
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        
    }
}
