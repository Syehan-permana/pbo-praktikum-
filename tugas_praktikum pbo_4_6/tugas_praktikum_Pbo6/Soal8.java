
package praktikum6;
import java.util.Scanner;
class Worker extends Thread {
    int id;

    Worker(int id) {
        this.id = id;
    }

    public void run() {
        System.out.println("Thread ke-" + id + " berjalan.");
    }
}

public class Soal8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Berapa banyak thread? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            Worker t = new Worker(i);
            t.start();
        }
    }
}
    

