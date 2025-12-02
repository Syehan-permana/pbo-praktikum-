
package praktikum7;

public class MainCivitas {
    public static void main(String[] args) {
        Civitas c = new Civitas("teknik");
        Dosen d1 = new Dosen("pak Fuad");
        Dosen d2 = new Dosen("pak Agus");
        
        c.tambahDosen(d1);
        c.tambahDosen(d2);
        
        Mahasiswa Mhs1 = new Mahasiswa("Mangiring");
        Mahasiswa Mhs2 = new Mahasiswa("Sidik");
        
        c.tambahMahasiswa(Mhs1);
        c.tambahMahasiswa(Mhs2);
        
        Staff stff1 = new Staff("om ebet");
        Staff stff2 = new Staff("hehehe");
        Staff stff3 = new Staff("lakoko");
        Staff stff4 = new Staff("cocomelon");
        
        c.tambahStaff(stff1);
        c.tambahStaff(stff2);
        c.tambahStaff(stff3);
        c.tambahStaff(stff4);
        
        c.tampil();
    }
}
