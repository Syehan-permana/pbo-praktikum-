package praktikum_pbo_tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class buah {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input jumlah buah
        System.out.print("Masukkan jumlah buah mangga yang dibeli: ");
        int mangga = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah tetangga: ");
        int tetangga = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah buah jambu per tetangga: ");
        int jambuPerTetangga = Integer.parseInt(br.readLine());

        System.out.print("Masukkan jumlah mangga busuk: ");
        int manggaBusuk = Integer.parseInt(br.readLine());

        // Hitung total buah
        int totalJambu = tetangga * jambuPerTetangga;
        int manggaBersih = mangga - manggaBusuk;
        int totalBuah = manggaBersih + totalJambu;

        // Output hasil
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Total Mangga Dibeli   : " + mangga);
        System.out.println("Mangga Busuk Dikembalikan : " + manggaBusuk);
        System.out.println("Mangga Bersih         : " + manggaBersih);
        System.out.println("Total Buah Jambu      : " + totalJambu);
        System.out.println("TOTAL BUAH DIMILIKI   : " + totalBuah);
    }
}
