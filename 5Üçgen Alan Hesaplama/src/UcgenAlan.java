import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        float a,b,c,u;
        double alan;


        Scanner giris = new Scanner(System.in);

        System.out.print("a kenarını giriniz: ");
        a = giris.nextFloat();

        System.out.print("b kenarını giriniz: ");
        b = giris.nextFloat();

        System.out.print("c kenarını giriniz: ");
        c = giris.nextFloat();

        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Ucgenin alanı: "+alan);

    }
}
