// Nama file: KonversiSuhu.java
public class KonversiSuhu {
    public static void main(String[] args) {
        double C = 10;
        double F = 15;
        double R = 5;

        // Celcius ke Fahrenheit dan sebaliknya
        double CtoF = (C * 9/5) + 32;
        double FtoC = (F - 32) * 5/9;

        // Celcius ke Reamur dan sebaliknya
        double CtoR = C * 4/5;
        double RtoC = R * 5/4;

        // Fahrenheit ke Reamur dan sebaliknya
        double FtoR = (F - 32) * 4/9;
        double RtoF = (R * 9/4) + 32;

        System.out.println("Celcius ke Fahrenheit = " + CtoF);
        System.out.println("Fahrenheit ke Celcius = " + FtoC);
        System.out.println("Celcius ke Reamur = " + CtoR);
        System.out.println("Reamur ke Celcius = " + RtoC);
        System.out.println("Fahrenheit ke Reamur = " + FtoR);
        System.out.println("Reamur ke Fahrenheit = " + RtoF);
    }
}
