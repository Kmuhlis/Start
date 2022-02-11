import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float r,pi = 3.14f,alfa,alan,cevre,alan2;

        Scanner degerler = new Scanner(System.in);

        System.out.print("Yarı Çapı Giriniz: ");
        r = degerler.nextFloat();

        System.out.print("Alfa Acısını Giriniz: ");
        alfa = degerler.nextFloat();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        alan2 = (alan*alfa)/360;

        System.out.println("Dairenin Cevresi: "+cevre + "\n" + "Dairenin Alanı: "+alan + "\n" + "Acısı Verilmis Alan: " + alan2 );
    }
}
