
package praktikum8;

public class Nilai {
    private int[] nilai;

    public Nilai(int[] nilai) {
        this.nilai = nilai;
    }
    
    public double hitung(){
        int jumlah = 0;
        for (int n : nilai) {
            jumlah += n;
        }
        return (double) jumlah/nilai.length;
    }
}
