
package praktikum7;
import java.util.ArrayList;
public class Civitas {
    String namaFakultas;
    
    ArrayList<Mahasiswa>daftarMhs = new ArrayList<>();
    ArrayList<Dosen>daftarDsn = new ArrayList<>();
    ArrayList<Staff>daftarStff = new ArrayList<>();

    public Civitas(String namaFakultas) {
        this.namaFakultas = namaFakultas;
    }
    
    void tambahDosen (Dosen dsn){
        daftarDsn.add(dsn);
    }
    void tambahMahasiswa (Mahasiswa Mhs){
        daftarMhs.add(Mhs);
    }
    void tambahStaff (Staff Stff){
        daftarStff.add(Stff);
    }
    
    void tampil(){
        System.out.println("Civitas " + namaFakultas);
        System.out.println("Daftar Dosen : ");
        for (Dosen Dsn : daftarDsn){
            System.out.println(Dsn.get());
        }
        System.out.println("Daftar Mahasiswa : ");
        for (Mahasiswa daftarMh : daftarMhs) {
            System.out.println(daftarMh.get());
        }
        System.out.println("Daftar Staff : ");
        for (Staff Stff : daftarStff) {
            System.out.println(Stff.get());
        }
    }
}
