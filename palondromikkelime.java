import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.
Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kelime Giriniz : ");
        String kelime = input.next();
        boolean status = true;

        for (int i = 0; i < kelime.length() / 2; i++) {
            if (kelime.charAt(i) != kelime.charAt(kelime.length() - i - 1)) {
                status = false;
            }
        }
        if (status == true) {
            System.out.println(kelime + " : Palindrom bir kelimedir.");
        } else {
            System.out.println(kelime + " : Palindrom bir kelime değildir.");
        }
    }
}
