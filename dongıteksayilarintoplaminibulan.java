import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve
        girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
        Ödev
        Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen
        değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
        */
        Scanner scann=new Scanner(System.in);
        String metin="negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve girilen " +
                "değerlerden tek sayıları toplayıp ekrana basan program";
        System.out.println(metin.toUpperCase());

        int adet =1,toplam=0;

        while (true){
            System.out.print(adet+".sayı : ");
            int sayi= scann.nextInt();
            adet++;
            if(sayi<0){
                break;
            }
            if (sayi > 0) {
                if (sayi % 2 != 0) {
                    toplam += sayi;
                }
            }
        }
        System.out.println("girilen tek sayıların toplamı : "+toplam);

        String metin2="tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen " +
                "değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan program";
        System.out.println(metin2.toUpperCase()+"-----");

        int adet2=1,toplam2=0;
        while (true){
            System.out.print(adet2+".sayı : ");
            int sayi2= scann.nextInt();
            adet2++;

            if (sayi2%2!=0){
                break;
            }
            if(sayi2%2==0&&sayi2%4==0){
                toplam2+=sayi2;
            }
        }
        System.out.println("çift ve 4 ün katları olan sayıların toplamı : "+toplam2);

    }
}
