
package Pertemuan8;


public class Buku {
    //atribut
    String judul, penulis;
    int tahun;
    
    //constructor
    public Buku(){
        this.judul = "tanpa judul";
        this.penulis = "Tidak DIketahui";
        this.tahun = 0;
    }
    
    public Buku(String judul){
        this.judul = "PBO";
        this.penulis = "Tidak Diketahui";
        this.tahun = 0;
    }
    
    public Buku(String judul, String penulis, int tahun){
        this.judul = "Web";
        this.penulis = "Tidak Diketahui";
        this.tahun = 0; 
    }
    
    void info(){
        System.out.println("Buku ini berjudul " + judul);
    }
    
    void info(boolean lengkap){
        System.out.println("Informasi Buku: ");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahun);
       }
    
    
    
}
