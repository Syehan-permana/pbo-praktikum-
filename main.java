package Pertemuan8;

public class main {
    public static void main(String[] args) {
        
        Buku b1 = new Buku();
        Buku b2 = new Buku("PBO");
        Buku b3 = new Buku("Web", "Aldi", 2025);
        
        
        Peminjam p1 = new Peminjam("Jajang");
        
        p1.kembalikan("Basdat");
       
        
        Buku b4 = p1.kembalikan("Basdat");
        
        System.out.println(b4.judul);
        
        int thn = 2025;
        System.out.println(thn);
        ubahTahun(thn);
        System.out.println("thn");
        
    }
        
 }
