import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız
. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.*/
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("dizi eleman sayısı :");
        int es = scanner.nextInt();
        int[] dizi = new int[es];
        
        for (int i = 0; i < es; i++) {
            System.out.print(i + 1 + ". sayı : ");
            dizi[i] = scanner.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));
    }
}
