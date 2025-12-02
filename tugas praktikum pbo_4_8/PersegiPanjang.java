
package praktikum8;

public class PersegiPanjang {
    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    public int luas(){
     return panjang*lebar;
    }
    
    public static int hitung(PersegiPanjang luar, PersegiPanjang dalam){
        return luar.luas() - dalam.luas();
    }
}
