import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class MyStack <E> {
    List<E> list = new ArrayList<E>();
    int top = -1; 
    void push(E e) {
        list.add(e);
        top++;
    }

    E pop() {
        if (top != -1) {
            return list.get(top--);
        } else {
            throw new EmptyStackException();
            //or return null;
        }
    }
}
