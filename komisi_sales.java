package praktikum_pbo_tugas4;

import java.util.Scanner;

public class komisi_sales {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    double penjualan;
    double komisi = 0;
    int jasa;
        System.out.print("Masukan jumlah penjualan anda hari ini :");
        penjualan=input.nextInt();
        if(penjualan==2000000){
            jasa=100000;
            komisi=penjualan*0.10;
     }else if(penjualan >2000000 && penjualan<=5000000){ // dan dan untuk salah satu nya benar agar di jalankan
         jasa=200000; 
         komisi=penjualan*0.15; 
   }else if(penjualan>5000000){
          jasa=300000;   
          komisi=penjualan*0.20;               
       }else{
            System.out.println("maaf anda tidak mendapatkan komisi ");
            }
        
        System.out.println("Total komisi anda hari ini adalah :"+komisi); 
        
        
        input.close();
    }
}
                