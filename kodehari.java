
package praktikum_pbo_tugas4;

import java.util.Scanner;


public class kodehari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        System.out.println("<------------Daftar Hari----------->");
        System.out.println("1.hari senin ");
        System.out.println("2 hari selasa");
        System.out.println("3 hari Rabu");
        System.out.println("4 hari kamis ");
        System.out.println("5 hari jumat ");
        System.out.println("6 hari sabtu ");
        System.out.println("7 hari minggu");
        System.out.print("Masukan nomber hari yang akan anda pilih (1-7) :");
        pilihan=input.nextInt();
        switch (pilihan){
            case 1:
                System.out.println("hari yang anda pilih adalah senin ");
            break;
            case 2:
                System.out.println("hari yang anda pilih adalah selasa");
            break;
            case 3:
                System.out.println("hari yang anda pilih adalah Rabu  ");
            break;
            case 4:
                System.out.println("hari yang anda pilih adalah Kamis ");
            break;
            case 5:
                System.out.println("hari yang anda pilih  adalah jumat ");
            break;
            case 6:
                System.out.println("hari yang anda pilih adalah Sabtu ");
            break;
            case 7:
                System.out.println("hari minggu ");
            break;
            
            
            default :
                System.out.println("hari tidak di temukan ");
            
        }
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

