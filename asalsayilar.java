import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
         */
        String metin = "1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.";
        System.out.println(metin.toUpperCase());

        int adet = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (i % j == 0) {
                    adet++;
                }
            }
            if (adet == 2) {
                System.out.print(i+" - ");
            }
            adet = 0;
        }
    }
}
