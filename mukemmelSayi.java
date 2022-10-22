import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
        değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
        Mükemmel Sayı Nedir ?
        Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
         */
        Scanner scann = new Scanner(System.in);
        String metin = "Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana mükemmel sayıdır.\n" +
                "değilse mükemmel sayı değildir. ifadelerini ekrana yazan program";
        System.out.println(metin.toUpperCase());

        int toplam = 0;

        while (true) {
            System.out.print("sayı : ");
            int sayi = scann.nextInt();
            for (int i = 1; i < sayi; i++) {
                if (sayi % i == 0) {
                    toplam = toplam + i;
                }
            }
            if (toplam == sayi) {
                System.out.println(sayi + " mükemmel sayıdır");
            }
            if (toplam != sayi) {
                System.out.println(sayi + " mükemmel sayı değildir");
            }
            toplam = 0;
        }
    }
}
