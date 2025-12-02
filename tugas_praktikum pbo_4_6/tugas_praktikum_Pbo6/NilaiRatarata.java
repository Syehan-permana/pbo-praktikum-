
package praktikum6;
import java.util.Scanner;
public class NilaiRatarata {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            try {
        System.out.print("Jumlah elemen: ");
        int n = sc.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nilai: ");
            data[i] = sc.nextInt();
        }

        int sum = 0;
        for (int v : data) sum += v;
        double rata = (double) sum / n;

        System.out.println("Rata-rata: " + rata);

    } catch (Exception e) {
        System.out.println("Input bukan angka");
    }
}
}
