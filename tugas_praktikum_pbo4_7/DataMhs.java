
package praktikum7;

public class DataMhs {
    String nama;
    String NPM;
    String kelas;

    public DataMhs(String nama, String NPM, String kelas) {
        this.nama = nama;
        this.NPM = NPM;
        this.kelas = kelas;
    }
    
    public void tampilkan(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NPM : " + this.NPM);
        System.out.println("Kelas : " + this.kelas);
    }
    
}

