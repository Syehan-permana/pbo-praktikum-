package praktikum5;
import java.util.Scanner;
public class pengulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int terbesar;
        int terkecil;
       System.out.println("masukan angka ke :");
        a=input.nextInt();////
        terbesar=a;
        terkecil=a;
        for(int i=1; i<=10; i++){
        System.out.print("masukan ke "+i+":");
         a=input.nextInt();////
         if (a > terbesar) {
                terbesar = a;
            }
            if (a < terkecil) {
                terkecil = a;
            }     
    }
        System.out.println("adalah angka terbesar :"+terbesar);
        System.out.println("adalah angka terkecil :"+terkecil);
}
}
