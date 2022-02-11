import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float boy, kilo, sonuc;

        Scanner girdi = new Scanner(System.in);
        System.out.print("Boyunuzu Girin: ");
        boy = girdi.nextFloat();

        System.out.print("Kilonuzu Girin: ");
        kilo = girdi.nextFloat();

        sonuc = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: "+sonuc);






    }
}
