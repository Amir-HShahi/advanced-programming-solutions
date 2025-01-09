public class Main {
    public static void main(String[] args) {
        MyThread 
        firstThread = new MyThread();
        firstThread.start();
        MyThread secondThread = new MyThread();
        secondThread.start();
    }

    
}

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            System.out.println(i);
        }
    }
} 
