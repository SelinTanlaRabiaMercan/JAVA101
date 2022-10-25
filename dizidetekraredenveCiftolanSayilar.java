import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazarak G*/
public class Main {

    public static void main(String[] args) {

        int[] dizi = {3, 3, 54, 76, 34, 23, 45, 56, 78, 54, 32, 21, 32, 54, 6, 67, 87, 98, 76, 54, 32, 2};
        int adet = 0;
        for (int i = 0; i < dizi.length; i++) {
            System.out.println(dizi[i]);
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    adet++;
                }
            }
            if (adet >= 2 && dizi[i] % 2 == 0) {
                System.out.println(dizi[i] + " sayısı " + adet + " kere tekrar ediyor ve çift sayı");
            }
            adet = 0;
        }
    }
}
