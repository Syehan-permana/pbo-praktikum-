package praktikum_pbo_tugas4;
import java.util.Scanner;

public class luasbangundatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
       int pilihan; 
        System.out.println("<---LUAS BANGUN DATAR  ----> ");
        System.out.println("1  persegi ");
        System.out.println("2  segitiga ");
        System.out.println("3  lingkaran");
        System.out.println("4  trapesium");
        System.out.println("5  Layang-layang");
        System.out.print("masukan pilihan (1/5) :");
        pilihan=input.nextByte();
            switch(pilihan){
            case 1:
                int alas,tinggi;
                double luas;
                System.out.print("Masukkan alas segitiga    : ");
                alas = input.nextByte();
                System.out.print("Masukkan tinggi segitiga  : ");
                tinggi = input.nextByte();
                luas = 0.5*alas*tinggi;
                System.out.println("luas segitiganya adalah :"+luas);
                break;

            }

                
                
                
                
                
                
   input.close();
    }
        
}   
        
        
        
        
        
        
        
        
        
        
      
    

