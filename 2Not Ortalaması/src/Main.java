import java.security.KeyStore;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Değişkenleri oluştur
        int mat, fizik, kimya, tarih, muzik, turkce, toplam;
        float ortalama;

        // Scaner sınınfını tanımladık
        Scanner giris = new Scanner(System.in);

        // Kullanıcıdan değerleri al
        System.out.print("Mat notunuzu gir: ");
        mat = giris.nextInt();

        System.out.print("Fizik notunuzu gir: ");
        fizik = giris.nextInt();

        System.out.print("Kimya notunuzu gir: ");
        kimya = giris.nextInt();

        System.out.print("Tarih notunuzu gir: ");
        tarih = giris.nextInt();

        System.out.print("Muzik notunuzu gir: ");
        muzik = giris.nextInt();

        System.out.print("Turkce notunuzu gir: ");
        turkce = giris.nextInt();

        toplam = mat + fizik + turkce + muzik + kimya + tarih;
        ortalama = toplam / 6;

        System.out.println("Not ortalaman: "+ortalama);

        String sonuc = 60 < ortalama ? "Geçtiniz" : "Kaldınız";
        System.out.println(sonuc);

    }
}
