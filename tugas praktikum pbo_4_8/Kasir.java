
package praktikum8;

public class Kasir {
     double hargaBarang;
     int jumlahBarang;
     double diskon; // dalam persen


    public Kasir(double hargaBarang) {
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = 1;
        this.diskon = 0;
    }

    public Kasir(double hargaBarang, int jumlahBarang) {
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.diskon = 0;
    }

    public Kasir(double hargaBarang, int jumlahBarang, double diskon) {
        this.hargaBarang = hargaBarang;
        this.jumlahBarang = jumlahBarang;
        this.diskon = diskon;
    }

    public double hitungTotal() {
        double total = hargaBarang * jumlahBarang;
        double totalSetelahDiskon = total - (total * diskon / 100);
        return totalSetelahDiskon;
    }

}
