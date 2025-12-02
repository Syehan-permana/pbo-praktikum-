
package praktikum8;

public class MainNilai {
    public static void main(String[] args) {
        int[] nilaiArray = {80,90,75,55,};
        Nilai n = new Nilai(nilaiArray);
        System.out.println("Rata-rata nilai adalah : " + n.hitung());
    }
}
