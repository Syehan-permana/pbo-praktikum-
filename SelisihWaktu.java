package praktikum_pbo_tugas3;

import java.util.Scanner;

public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENGHITUNG SELISIH WAKTU ===");

        // Input waktu pertama
        System.out.print("Masukkan jam pertama: ");
        int jam1 = input.nextInt();
        System.out.print("Masukkan menit pertama: ");
        int menit1 = input.nextInt();
        System.out.print("Masukkan detik pertama: ");
        int detik1 = input.nextInt();

        // Input waktu kedua
        System.out.print("\nMasukkan jam kedua: ");
        int jam2 = input.nextInt();
        System.out.print("Masukkan menit kedua: ");
        int menit2 = input.nextInt();
        System.out.print("Masukkan detik kedua: ");
        int detik2 = input.nextInt();

        // Konversi waktu ke detik total
        int totalDetik1 = (jam1 * 3600) + (menit1 * 60) + detik1;
        int totalDetik2 = (jam2 * 3600) + (menit2 * 60) + detik2;

        // Hitung selisih dalam detik
        int selisih = Math.abs(totalDetik2 - totalDetik1);

        // Konversi kembali ke jam, menit, detik
        int jamSelisih = selisih / 3600;
        int sisa = selisih % 3600;
        int menitSelisih = sisa / 60;
        int detikSelisih = sisa % 60;

        // Output hasil
        System.out.println("\n=== HASIL SELISIH WAKTU ===");
        System.out.println("Selisih waktu: " + jamSelisih + " jam " + 
                           menitSelisih + " menit " + detikSelisih + " detik");

        input.close();
    }
}