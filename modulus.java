package praktikum_pbo_tugas4;

import java.util.Scanner;

public class modulus {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
     int  a,b;
     int hasil;
        System.out.print("Masukan angka pertama :");
        a=input.nextInt();
        System.out.print("masukan angka kedua   :");
        b=input.nextInt();
     
        hasil=a%b;
        
        System.out.println("Setelah di moduluskan hasilnya adalah :"+hasil);
        
        
        
        
        
        
    }
    
}
