
package praktikum8;

public class Faktorial {
    int n;

    public Faktorial(int n) {
        this.n = n;
    }
    
    public float hitung(){
        float hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }
}
