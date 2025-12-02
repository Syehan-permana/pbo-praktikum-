
package praktikum6;
import java.util.Scanner;
public class PenjumlahanMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Baris: ");
    int r = sc.nextInt();
    System.out.print("Kolom: ");
    int c = sc.nextInt();

    int[][] m = new int[r][c];
    int total = 0;

    for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
            System.out.print("m[" + i + "][" + j + "]: ");
            m[i][j] = sc.nextInt();
            total += m[i][j];
        }
    }

    System.out.println("Jumlah semua elemen: " + total);
}
   
}

