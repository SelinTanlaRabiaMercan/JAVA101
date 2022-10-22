import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
         *Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
         */
        Scanner scann=new Scanner(System.in);
        String metin="sayının armstrong sayı olup olmadığını bulan program";
        System.out.println(metin.toUpperCase());

        System.out.print("sayı : ");
        int sayi= scann.nextInt();

       int bs=0,sayi1=0,islem=0,sayi3=0;

       sayi3=sayi;
       sayi1=sayi;

       while (sayi>0){
           sayi=sayi/10;
           bs++;
       }
        System.out.println("basamak sayısı : "+bs);

        while (sayi1>0){
            int v=sayi1 % 10;
            System.out.println(v+" ^ "+bs+" : "+Math.pow(v,bs));
            islem+=Math.pow(v,bs);
            sayi1 = sayi1/10;
        }
        System.out.println("+____________");
        System.out.println(islem);

        if (sayi3==islem){
            System.out.println("armstrong sayı\n-----");
        }
        if (sayi3!=islem){
            System.out.println("armstrong sayı değil\n-----");
        }

        /*
        * Ödev
        *Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        *Örnek : 1643 = 1 + 6 + 4 + 3 = 14
        * */
        String metin2="Bir sayının basamak sayılarının toplamını hesaplayan program ";
        System.out.println(metin2.toUpperCase());

        System.out.print("sayı : ");
        int n1= scann.nextInt();

        int bas=0,toplam=0,islem2=0;

        while (n1>0){
            int k=n1%10;
            System.out.println("basamak sayıları : "+k);
            toplam+=k;
            n1=n1/10;
        }
        System.out.println("basamak sayılarının toplamı : "+toplam);

    }
}
