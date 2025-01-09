import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LineCounter {
    public static int countLines(String fileName) {
        int count = 0;
        try {
            FileReader fr = new FileReader(fileName);
            int character;
            if (-1 != (character = fr.read())) { //init for first line
                count++;
            }
            while (-1 != (character = fr.read())) {
                if (((char) character) == '\n') {
                    count++;
                }
            }
            fr.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        return count; 
    }
}
