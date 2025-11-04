package praktikum5;

import java.util.Scanner;

public class trianggel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak baris: ");
        int baris = input.nextInt();

        int angka = 1; // inisialisasi angka pertama

        // Perulangan luar untuk jumlah baris
        for (int i = 1; i <= baris; i++) {
            // Perulangan dalam untuk mencetak angka per baris
            for (int j = 1; j <= i; j++) {
                System.out.print(angka + " ");
                angka++; // menambah angka setiap kali dicetak
            }
            // pindah ke baris berikutnya
            System.out.println();
        }
    }
}
