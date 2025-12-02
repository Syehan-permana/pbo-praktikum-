
package praktikum8;

public class BarisanAngka {
    private int[] angka;

    public BarisanAngka(int[] angka) {
        this.angka = angka;
    }
    
    public void tampil(){
        for (int n : angka) {
            System.out.println(n +" ");
        }
        System.out.println();
    }
}
