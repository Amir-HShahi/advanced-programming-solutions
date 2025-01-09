import java.util.ArrayList;

public class MyQueue<E> {
    ArrayList<E> list = new ArrayList<E>();
    
    public static void main(String[] args) {
        MyQueue<Object> queue = new MyQueue<Object>();
        queue.push("111");
        queue.push("222");
        queue.push(333);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());

        queue.pop();
        
        
    }

    void push(E e) {
        list.add(e);
    }

    E pop() {
        return list.remove(0); // remove and return that object
    }
    
}
