import java.util.ArrayList;
import java.util.List;

public class Search <T extends Comparable<T>>{
    List<T> list = new ArrayList<>();
    
    public boolean search(T element) {
        for (T t : list) {
            if (t.compareTo(element) == 0) {
                return true;
            }
        }
        return false;
    }
}