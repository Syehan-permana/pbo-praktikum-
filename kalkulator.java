
package Syehan_praktikum;

import java.util.Scanner;


public class kalkulator {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
      double a,b,hasil;
      int pilihan;
       int operator;
        System.out.println("------ kalkulator sederhana ----- :");
        System.out.print("masukan angka pertama :");
        a=input.nextDouble();
        System.out.print("masukan angka kedua  :");
        b=input.nextDouble();
        
        System.out.println("1  + ");
        System.out.println("2  -");
        System.out.println("3  * ");
        System.out.println("4  /");
         System.out.print("pilih operator yang akan anda pilih :");
        operator=input.nextInt();
        
        
        
        switch(operator){
            case 1:
                hasil=a+b;
                System.out.print("hasil pertambahan adalah "+hasil);
                break;
            case 2:
                hasil=a-b;
                System.out.print("hasil pengurangan adalah "+hasil);
                break;
            case 3:
                hasil=a*b;
                System.out.print("hasil perkalian adalah "+hasil);
                break;
             case 4:
                hasil=a/b;
                System.out.print("hasil pembagian adalah "+hasil);
                break;
             default:
                 System.out.println("angka tidak dapat di ketahui ");
                 
      
      
      
      
      
      
        }
      input.close();
      
      
    }    
}
