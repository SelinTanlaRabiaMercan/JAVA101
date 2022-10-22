import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *Java'da döngüler kullanılarak yıldızlar ile üçgen yapıyoruz.
         */
        Scanner scann = new Scanner(System.in);
        String metin = "yıldızlar ile üçgen";
        System.out.println(metin.toUpperCase());

        System.out.print("sayı : ");
        int sayi = scann.nextInt();

        for (int i=0;i<sayi;i++){
            for (int j = 0; j < (sayi - i); j++) {
                System.out.print(" ");//baş kısmına boşluk koyulmasını sağlıyor
            }
            for (int k = 1; k <= (2 * i +1); k++) {//2* simetri olmasını sağlıyor +1 ilk yıldızın koyulmasını sağlıyorr
                System.out.print("*");
            }
            System.out.println(" ");//alt alta yazılmasını sağlıyor
        }
        System.out.println("-----");
        /*
        * Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
        * */
        String metin2 = "yıldızlar ile elmas";
        System.out.println(metin2.toUpperCase());

        System.out.print("sayı : ");
        int sayi1 = scann.nextInt();

        for (int i=0;i<sayi1;i++){
            for (int j = 0; j < (sayi1 - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i +1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
     //   System.out.println("---");

        for (int i=sayi1;i>=0;i--){
            for (int j = (sayi1 - i); j>0  ; j--) {
                System.out.print(" ");
            }
            for (int l = (2 * i +1); l >= 1; l--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
