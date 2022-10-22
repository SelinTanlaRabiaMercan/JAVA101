import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın
         *9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
         */
        Scanner scann = new Scanner(System.in);
        String metin = "döngüler ile fibonacci serisi bulan program yazıyoruz.";
        System.out.println(metin.toUpperCase());

        System.out.print("eleman sayısı : ");
        int es = scann.nextInt();

        int sonuc = 0, sayi1, sayi2 = 1;

        for (int i = 0; i < es; i++) {
            sayi1 = sayi2;
            sayi2 = sonuc;
            sonuc = sayi1 + sayi2;
            System.out.println(sonuc);
        }
    }
}
