import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.
         *Ödev
         *Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
         */
        Scanner scann=new Scanner(System.in);
        String metin="üslü sayı hesaplayan program - while döngüsü";
        System.out.println(metin.toUpperCase());

        System.out.print("sayı : ");
        int sayi= scann.nextInt();
        System.out.print("us sayı : ");
        int ussayi= scann.nextInt();

        int adet=1,deneme=1;
        while (adet<=ussayi){
            deneme*=sayi;
            adet++;
        }
        System.out.println(sayi+" üzeri "+ussayi+" : "+deneme+"\n-----");

        String metin2="üslü sayı hesaplayan program - for döngüsü";
        System.out.println(metin2.toUpperCase());

        System.out.print("sayı : ");
        int sayi2= scann.nextInt();
        System.out.print("üssayı : ");
        int ussayi2= scann.nextInt();
        int us=1;

        for(int i=1;i<=ussayi2;i++){
            us*=sayi2;
        }
        System.out.println(sayi2+" ^ "+ussayi2+" : "+us);

    }
}
