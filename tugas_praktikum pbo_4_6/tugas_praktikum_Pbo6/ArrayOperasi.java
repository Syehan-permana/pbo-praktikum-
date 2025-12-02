
package praktikum6;
import java.util.Scanner;
public class ArrayOperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Jumlah elemen: ");
    int n = sc.nextInt();

    int[] data = new int[n];

    for (int i = 0; i < n; i++) {
        System.out.print("Elemen " + i + ": ");
        data[i] = sc.nextInt();
    }

    int max = data[0];
    int min = data[0];
    int idxMax = 0;
    int idxMin = 0;

    for (int i = 0; i < n; i++) {
        if (data[i] > max) {
            max = data[i];
            idxMax = i;
        }
        if (data[i] < min) {
            min = data[i];
            idxMin = i;
        }
    }

    System.out.println("Nilai terbesar: " + max + " di index " + idxMax);
    System.out.println("Nilai terkecil: " + min + " di index " + idxMin);

    int jumlah = 0;
    for (int v : data) jumlah += v;
    double rata = (double) jumlah / n;
    System.out.println("Rata-rata: " + rata);

    int jumlahGanjil = 0;
    int jumlahGenap = 0;

    for (int i = 0; i < n; i++) {
        if (i % 2 == 0) jumlahGenap += data[i];
        else jumlahGanjil += data[i];
    }

    System.out.println("Jumlah index ganjil: " + jumlahGanjil);
    System.out.println("Jumlah index genap: " + jumlahGenap);

    System.out.print("Cek elemen ganjil genap: ");
    for (int v : data) {
        if (v % 2 == 0) System.out.println(v + " genap");
        else System.out.println(v + " ganjil");
    }

    java.util.Arrays.sort(data);
    System.out.println("Setelah diurutkan:");
    for (int v : data) System.out.println(v);
}

}

