package praktikum_pbo_tugas3;

import java.util.Scanner;

public class sentipental {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENGHITUNG GAYA SENTRIPETAL ===");
        System.out.print("Masukkan massa benda (kg): ");
        double m = input.nextDouble();

        System.out.print("Masukkan kecepatan benda (m/s): ");
        double v = input.nextDouble();

        System.out.print("Masukkan jari-jari lintasan (m): ");
        double r = input.nextDouble();

        // Rumus gaya sentripetal
        double Fc = (m * (v * v)) / r;

        System.out.println("\nGaya sentripetal (Fc) = " + Fc + " Newton");

        input.close();
    }
}