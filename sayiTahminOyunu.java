import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("SAYI TAHMİN OYUNU");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int tahminedilceksayi = random.nextInt(100);

        System.out.println(tahminedilceksayi);
        int secim;
        int kalanhak = 5;
        int adet = 0;
        int[] tahminler = new int[5];


        while (kalanhak < 6) {

            System.out.print("tahmininizi girin: ");
            int tahmin = scanner.nextInt();
            if (tahmin != tahminedilceksayi) {
              kalanhak--;
                adet++;
                tahminler[kalanhak--] = tahmin;

            }
            if(tahmin<tahminedilceksayi){
                System.out.println("daha yüksek");
            }
            if(tahmin>tahminedilceksayi){
                System.out.println("daha düşük");
            }
            if (tahmin == tahminedilceksayi) {

                System.out.println("tahmin ettiniz");
                tahminler[kalanhak--] = tahmin;
                break;

            }
            if (kalanhak < 0) {
                System.out.println("hakkınız bitti");
                System.out.println("tahminleriniz : ");
                System.out.println("sayı : " + tahminedilceksayi);
                System.out.println(Arrays.toString(tahminler));
                break;
            }
        }
    }
}
