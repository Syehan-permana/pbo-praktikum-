
package praktikum7;
import java.util.Scanner;
public class MainDataMhs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukan Nama : ");
        String nama = sc.nextLine();
        
        System.out.println("Masukan NPM : ");
        String NPM = sc.nextLine();
        
        System.out.println("Masukan Kelas : ");
        String kelas = sc.nextLine();
        
        DataMhs mhs = new DataMhs(nama, NPM, kelas);
        mhs.tampilkan();
    }
}
