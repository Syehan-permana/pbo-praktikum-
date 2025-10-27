package Syehan_praktikum;
public class pytagoras_persegipanjang_persamaan_kuadrat {
    public static void main(String  [] args) {
        
          // pytagoras
        double a = 6;
        double b = 8;
        
        
        double c = Math.sqrt((a * a) + (b * b)); // mencari sisi miring
        double keliling = a + b + c;
        System.out.println("<----perhitungan pytagoras ----> ");
        System.out.println("Sisi a = " + a);
        System.out.println("Sisi b = " + b);
        System.out.println("Sisi miring c = " + c);
        System.out.println("Keliling Segitiga = \n" + keliling);
        
        //persegi panjang
        // Menghitung 
        int panjang = 50;
        int lebar = 45;
        System.out.println("<----perhitungan persegi panjang----> ");
        int luas = panjang * lebar;
        // Menampilkan hasil
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas Persegi Panjang: " + luas);
        
        System.out.println("<----perhitungan persamaan kuadrat ----> ");
        int angka1=5;
        int angka2=5;
        int angka3=5;
        
        int hasil=(int) ((b*b)-(4*a*c));
        System.out.println("a ="+a);
        System.out.println("a ="+b);
        System.out.println("a ="+c);
        System.out.println("hasil dari persamaan kuadrat adalah :"+hasil);
        
        
        
        
    }
        
        
        
        
        
        
        
        
        
        
        
    }

