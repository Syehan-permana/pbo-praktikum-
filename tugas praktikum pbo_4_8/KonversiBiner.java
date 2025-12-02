
package praktikum8;

public class KonversiBiner {
    int bilangan;

    public KonversiBiner(int bilangan) {
        this.bilangan = bilangan;
    }
    
    public String keBiner(){
        String kebiner = "";
        int angka = bilangan;
        
        if (angka == 0) {
            return "0";
        }
        while (angka > 0) {            
            int sisa = angka % 2;
            kebiner = sisa + kebiner;
            angka = angka / 2;
        }
        return kebiner;
    }
}
