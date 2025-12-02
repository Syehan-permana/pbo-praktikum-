
package praktikum6;

public class soal2 {
    public static void main(String[] args) {
        String[]mobil = {"tesla","suzuki","civic","mazda","BMW"};
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("suzuki")) {
                 mobil[1]="totoya";
        System.out.println("nilai index yang dirubah : "+mobil[i]);
            }
        }
       
    }
}
