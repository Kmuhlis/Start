import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        float armut,armutF=2.14f,elma,elmaF=3.67f,domates,domatesF=1.11f,muz,muzF=0.95f,toplam,patlican,patlicanF=5;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armut = input.nextFloat();

        System.out.print("Elma Kaç Kilo ? : ");
        elma = input.nextFloat();

        System.out.print("Domates Kaç Kilo ? : ");
        domates = input.nextFloat();

        System.out.print("Muz Kaç Kilo ? : ");
        muz = input.nextFloat();

        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlican = input.nextFloat();

        System.out.print("Armut Kaç Kilo ? : "+armut+"\n"+"Elma Kaç Kilo ? : "+elma+"\n"+"Domates Kaç Kilo ? : "+domates+"\n"+"Muz Kaç Kilo ? : "+muz+"\n"+"Patlıcan Kaç Kilo ? : "+patlican+"\n");
        toplam = (armut*armutF)+(elma*elmaF)+(domates*domatesF)+(muz*muzF)+(patlican*patlicanF);
        System.out.println("Toplam Tutar: "+toplam+" Tl");

    }
}
