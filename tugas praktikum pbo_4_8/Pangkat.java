
package praktikum8;

public class Pangkat {
    int basis;
    int eksponen;

    public Pangkat(int basis, int eksponen) {
        this.basis = basis;
        this.eksponen = eksponen;
    }
    
    public float hitung(){
        float hasil= 1;
        for (int i = 0; i < eksponen; i++) {
            hasil *= basis;
        }
        return hasil;
    }
}
