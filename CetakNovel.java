package praktikum_pbo_tugas3;

import java.util.Scanner;

public class CetakNovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah lembar novel: ");
        int lembar = input.nextInt();

        // Karena 1 lembar = 1 detik
        int totalDetik = lembar;

        // Konversi waktu
        int hari = totalDetik / 86400;          // 1 hari = 86400 detik
        int sisa = totalDetik % 86400;

        int jam = sisa / 3600;                  // 1 jam = 3600 detik
        sisa = sisa % 3600;

        int menit = sisa / 60;                  // 1 menit = 60 detik
        int detik = sisa % 60;

        // Output
        System.out.println("\n===== HASIL PERHITUNGAN =====");
        System.out.println("Jumlah Lembar    : " + lembar);
        System.out.println("Total Waktu      : " + hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik");
    }
}
