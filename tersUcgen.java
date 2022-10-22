import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.
         */
        Scanner scann = new Scanner(System.in);
        String metin = "basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen program";
        System.out.println(metin.toUpperCase());

        System.out.print("basamak sayısı : ");
        int bs= scann.nextInt();

        for (int i=bs;i>0;i--){
            for (int j=(bs-i);j>0;j--){
                System.out.print(" ");
            }
            for (int k=(2*i);k>1;k--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
