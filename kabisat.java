package praktikum_pbo_tugas4;

import java.util.Scanner;

public class kabisat {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        System.out.print("masukan tahun kabisat :");       
        a=input.nextByte();
       if(a % 400==0 || a % 200==0 ){
           System.out.println("Tahun ini  adalah tahun kabisat  ");
       }else{ 
           System.out.println("Tahun ini bukan tahun kabisat    ");   
       }
        
        
        
        
  
        
    }  
 }
    
    
