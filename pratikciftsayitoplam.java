import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.
        Ödev
        Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
        ortalamasını hesaplayan programı yazınız.
        */
        Scanner scann=new Scanner(System.in);
        System.out.println("GİRİLEN SAYIYA KADAR ÇİFT SAYILARI BULAN PROGRAM");

        System.out.print("sayı : ");
        int sayi= scann.nextInt();

        for (int i=0;i<=sayi;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        String metin="0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam " +
        "bölünen sayıların ortalamasını hesaplayan program";
        System.out.println("-----\n"+metin.toUpperCase());
        System.out.print("sayı : ");
        int sayi2= scann.nextInt();

        int toplam=0,adet=0;

        for (int j=0;j<=sayi2;j++){
            if(j%3==0&&j%4==0){
                System.out.println("3 e ve 4 e tam bölünen sayı : "+j);
                toplam+=j;
                adet++;
            }
        }
        System.out.println("3 e ve 4 e tam bölünen sayıların adeti : "+adet);
        System.out.println("3 e ve 4 e tam bölünen sayıların toplamı : "+toplam);
        System.out.println("3 e ve 4 e tam bölünen sayıların ortalaması : "+(toplam/adet));
    }
}
