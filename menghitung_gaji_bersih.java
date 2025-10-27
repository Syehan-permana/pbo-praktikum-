package praktikum_pbo_tugas4;

import java.util.Scanner;

public class menghitung_gaji_bersih {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String nik,nama;
        int kodegolongan,jumlahanak = 0;
        int gajihpokok = 0;
        double tunjangananak;
        double gajihbersih = 0;
        System.out.print("masukan nama anda:");
        nik=input.nextLine();
        System.out.print("masukan nik  danda: ");
        nik=input.nextLine();
        System.out.println("<-----pilih Status anda ------>");
        System.out.println("1.menikah ");
        System.out.println("2.belum menikah ");
        System.out.println("3.cerai ");
        System.out.println("4.menikah dan sudah punya anak  ");
        System.out.println("silakan pilih terlebih dahulu /n");
        
        System.out.print("masukan kode golongan dan status anda(1/4):");
        kodegolongan=input.nextInt();
        switch(kodegolongan){
            case 1:   
            gajihpokok=1200000;
            System.out.println("Status anda sudah menikah ");
            break;
            case 2:   
            gajihpokok=1500000;
            System.out.println("Status belum sudah menikah ");
            break;
            case 3:   
            gajihpokok=17500000;
            System.out.println("Status anda sudah cerai ");
            break;
            case 4:   
            gajihpokok=2000000;
            System.out.println("Status anda sudah menikah dan mempunyai anak  ");
            double tunjanganpasangan = 0.10*gajihpokok;
            tunjangananak = 0.05* gajihpokok * jumlahanak;
            break;
            default:
                System.out.println("Anda bukan karyawan di sini huuuu ");
            break;
        }
        
        System.out.println("----Total gajih karyawan pt Hans permana ----->/n");
        System.out.println("gajih anda adalah pokok Rp: "+ gajihpokok);
        System.out.println("gajih bersih anda adalah :"+ gajihbersih);
        System.out.println("<-----mantap kawankuuu------------------------>");
        
        
        
        
        
        
        
        
        
    }
}
