package praktikum_pbo_tugas4;

import java.util.Scanner;

public class Tugas4_kasirsederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int uangdiberikan, totalbelanja, diskon = 0, totalbayar, kembalian;
        String falidasi;

        System.out.println("=== Program Kasir Toko bangunan  ===");
        System.out.print("Apakah anda mempunyai kartu member (ya/tidak): ");
        falidasi = input.nextLine();

        System.out.print("Masukkan total belanja Rp : ");
        totalbelanja = input.nextInt();

        // Logika if-else
        if (falidasi.equalsIgnoreCase("ya")) {
            if (totalbelanja >= 500000) {
                diskon = 50000;
                System.out.println("Selamat! Anda mendapat diskon Rp " + diskon);
            } else if (totalbelanja > 100000) {
                diskon = 15000;
                System.out.println("Anda mendapat diskon Rp " + diskon);
            } else {
                diskon = 0;
                System.out.println("Maaf, anda belum mendapat diskon.");
            }
        } else { // tidak memiliki kartu member
            if (totalbelanja > 100000) {
                diskon = 10000;
                System.out.println("Anda mendapat diskon Rp " + diskon);
            } else {
                diskon = 0;
                System.out.println("Maaf, anda belum mendapat diskon.");
            }
        }

        // Hitung total bayar
        totalbayar = totalbelanja - diskon;

        System.out.print("Masukkan uang yang diberikan: Rp ");
        uangdiberikan = input.nextInt();

        // Hitung kembalian
        kembalian = uangdiberikan - totalbayar;

        // Cetak hasil
        System.out.println("\n<----- Struk Pembelian ----->");
        System.out.println("Total Belanja  Rp :  " + totalbelanja);
        System.out.println("Diskon         Rp: " + diskon);
        System.out.println("Total Bayar    Rp:  " + totalbayar);
        System.out.println("Uang Diberikan Rp:  " + uangdiberikan);
        System.out.println("Kembalian      Rp:  " + kembalian);
        System.out.println("<----------------------------->");

        input.close();
    }
}
