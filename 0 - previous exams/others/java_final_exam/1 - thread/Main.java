public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i * j);
            }
        }
        System.exit(0);
    }

    
}

class MyThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("inner");
        }
    }
} 