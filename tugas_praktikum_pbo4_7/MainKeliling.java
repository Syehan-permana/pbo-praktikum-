
package praktikum7;
import java.util.Scanner;
public class MainKeliling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KelilingPersegiPanjang kl = new KelilingPersegiPanjang();
        System.out.println("Masukan Panjang : ");
        kl.panjang = sc.nextInt();
        
        System.out.println("Masukan Lebar : ");
        kl.lebar = sc.nextInt();
        
        System.out.println("keliling : " + kl.hitung());
    }
}
