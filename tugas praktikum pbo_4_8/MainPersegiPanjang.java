
package praktikum8;

import static praktikum8.PersegiPanjang.hitung;

public class MainPersegiPanjang {
    public static void main(String[] args) {
         PersegiPanjang luar = new PersegiPanjang(10, 5);
    PersegiPanjang dalam = new PersegiPanjang(8, 4);
    
    int luasHitam = hitung(luar,dalam);
        System.out.println("luas warna hitam adalah : " + luasHitam);
    } 
}
