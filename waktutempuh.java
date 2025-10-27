package Syehan_praktikum;
public class waktutempuh {
    public static void main(String[] args) {
        double kecepatanCahaya = 300000; // km/s
        double jarakBulan = 384400; // km
        double jarakMatahari = 152.1e6; // 152.1 juta km

        double waktuBulan = jarakBulan / kecepatanCahaya;
        double waktuMatahari = jarakMatahari / kecepatanCahaya;

        System.out.println("Waktu tempuh cahaya ke Bulan: " + waktuBulan + " detik");
        System.out.println("Waktu tempuh cahaya ke Matahari: " + waktuMatahari + " detik");
    }





    
}
