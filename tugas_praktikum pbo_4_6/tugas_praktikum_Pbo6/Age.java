
package praktikum6;

public class Age {
    public static void main(String[] args) {
        int []age = {12,4,5,2,6};
        for (int i = 0; i < age.length; i++) {
        System.out.print(age[i]+"\t");
    }

    for (int A : age) {
        System.out.println(A);
    }
    }
}
