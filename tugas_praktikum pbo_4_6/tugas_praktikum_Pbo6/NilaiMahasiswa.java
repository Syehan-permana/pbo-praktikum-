
package praktikum6;
import java.util.Scanner;
public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Jumlah mahasiswa: ");
    int n = sc.nextInt();
    sc.nextLine();

    String[] nama = new String[n];
    int[] nilai = new int[n];
    String[] status = new String[n];

    for (int i = 0; i < n; i++) {
        System.out.print("Nama: ");
        nama[i] = sc.nextLine();
        System.out.print("Nilai: ");
        nilai[i] = sc.nextInt();
        sc.nextLine();

        if (nilai[i] <= 50) status[i] = "Tidak Lulus";
        else status[i] = "Lulus";
    }

    System.out.println("Daftar Nilai Mahasiswa");
    for (int i = 0; i < n; i++) {
        System.out.println((i + 1) + " " + nama[i] + " " + nilai[i] + " " + status[i]);
    }
}

    }

