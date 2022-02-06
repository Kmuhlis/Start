package com.company;

public class Main {
    public static void main(String[] args) {

        int sayı1 = 200;
        int sayı2 = 255;
        int sayı3 = 379;
        int sayı4 = 1342;
        int enBuyuk = 0;
        if(sayı1>sayı2 ) {
            enBuyuk = sayı1;
        }else {
            enBuyuk = sayı2;
        }
        if(enBuyuk<sayı3 ) {
            enBuyuk = sayı3;
        }
        if(enBuyuk<sayı4 ) {
            enBuyuk = sayı4;
        }
        System.out.println(enBuyuk);
    }
}