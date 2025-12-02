
package praktikum7;
import java.util.Scanner;
public class MainTebakTanggal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TanggalLahir tg = new TanggalLahir();
        System.out.println("Masukan Bulan Lahir dalam angka : ");
        int bulan = sc.nextInt();
        
        System.out.println("Masukan Tanggal Lahir : ");
        int tanggal = sc.nextInt();
        
        int hasil = tg.hitungkode(bulan, tanggal);
        System.out.println("hasil akhir : " + hasil );
    }
}
