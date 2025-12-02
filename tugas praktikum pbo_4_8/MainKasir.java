
package praktikum8;

public class MainKasir {
    public static void main(String[] args) {
        Kasir k1 = new Kasir(10000);
        System.out.println("Total harga (hanya harga barang): " + k1.hitungTotal());

        Kasir k2 = new Kasir(10000, 3);
        System.out.println("Total harga (harga dan jumlah barang): " + k2.hitungTotal());

        Kasir k3 = new Kasir(10000, 3, 10);
        System.out.println("Total harga (lengkap dengan diskon): " + k3.hitungTotal());
    }   
}
