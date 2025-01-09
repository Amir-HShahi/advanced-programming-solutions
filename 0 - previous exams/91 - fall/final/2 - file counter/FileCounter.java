import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.List;

public class FileCounter {
    public static void main(String[] args) {
        FileCounter foo = new FileCounter("FirstFile.txt", "SecondFile.txt");
        foo.count();
    }
    
    String firstFilePath;
    String secondFilePath;

    FileCounter(String firstFilePath, String secondFilePath) {
        this.firstFilePath = firstFilePath;
        this.secondFilePath = secondFilePath;
    }

    void count() {
        List<String> words = readWords();
        HashMap<String, Integer> countTable = new HashMap<String, Integer>();
        for (String string : words) {
            countTable.put(string, 0);
        }

        for (String string : words) {
            countTable.put(string, countTable.get(string) + 1);
        }

        String output = "";
        for (String string : words) {
            output += string + "   " + countTable.get(string) + "\n";
        }

        try {
            FileWriter fw = new FileWriter(secondFilePath);
            Formatter fo = new Formatter(fw);
            fo.format(output);
            fo.flush();
            fw.close();
            fo.close();
        } catch (IOException e) {
        }
        
    }

    List<String> readWords() {
        String fileString = "";
        try {
            FileReader fr = new FileReader(firstFilePath);
            int character;
            while (-1 != (character = fr.read())) {
                fileString += (char) character;
            }
            fr.close();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }

        List<String> words = new ArrayList<String>();
        String word = "";
        for (int j = 0; j < fileString.length(); j++) {
            if ((fileString.charAt(j) == ',') || (fileString.charAt(j) == '\n') || (fileString.charAt(j) == ' ')) {
                words.add(word);
                word = "";
                continue;
            }
            word += fileString.charAt(j);
        }
        words.add(word);    
        return words;
    } 
}