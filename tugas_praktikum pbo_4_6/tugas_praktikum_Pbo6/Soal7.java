
package praktikum6;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread sedang berjalan...");
    }
}

public class Soal7 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // memulai thread
    }
}

