package Pertemuan8;


public class Peminjam {
    String nama;

    public Peminjam(String nama) {
        this.nama = nama;
    }
    
    void meminjam(Buku bk){
        System.out.println(nama + " meminjam " + bk.judul);
    }
    
    Buku kembalikan(String judul){
        Buku bk = new Buku (judul);
        return bk;
    }
}
