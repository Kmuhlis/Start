public class Main {
    public static void main(String[] args) {
        // Byte 8 bit
        byte MAx = 127 , MIn = -128;
        // short 16 bit
        short max = 32767 , min = -32768;
        // integer 32 bit
        int maxx = 2147483647, minn = -2147483648;
        // long 64 bit değer sonuna l ekle
        long Max = 9223372036854775807l, Min = -9223372036854775807l;
        // float 32 bit değer sonuna "f" koy     max 1.4*10^-45    min 3.4*10^38
        float MAX = 55.45f, MIN = 25.8f, toplam = MAX + MIN;
        // double 64 bit max 4.9*10^-324  min 1.8*10^308
        double maxxx = 8.889, minnn = 4.99546;
        // char 16 bit 255 e kadar numaralandirilmis ascii kodlarından olusur
        char vchar = 'b';
        char v2char = 98;
        // boolean 2 değeri vardır
        boolean dogru = true;
        boolean yanlis = false;

        System.out.println(vchar);
        System.out.println(v2char);
        System.out.println(toplam);
    }
}
