package praktikum_pbo_tugas3;
import java.util.Scanner;

public class GajiBersihPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nomor Induk Karyawan: ");
        String npm = input.nextLine();
        System.out.print("Nama Karyawan: ");
        String nama = input.nextLine();
        System.out.print("Alamat: ");
        String alamat = input.nextLine();

        String jabatan = "Manajer";
        double gajiPokok = 2000000;
        double tunjanganJabatan = 300000;
        double tunjanganIstri = 200000;
        double tunjanganAnak = 150000;

        double totalGaji = gajiPokok + tunjanganJabatan + tunjanganIstri + tunjanganAnak;
        double pajak = 0.1 * totalGaji;
        double gajiBersih = totalGaji - pajak;

        System.out.println("\n===== SLIP GAJI KARYAWAN =====");
        System.out.println("NPM             : " + npm);
        System.out.println("Nama Karyawan   : " + nama);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Jabatan         : " + jabatan);
        System.out.println("Total Gaji      : " + totalGaji);
        System.out.println("Pajak (10%)     : " + pajak);
        System.out.println("Gaji Bersih     : " + gajiBersih);
    }
}