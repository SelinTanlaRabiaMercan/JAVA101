import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */
        Scanner scann=new Scanner(System.in);
        String metin="girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran program";
        System.out.println(metin.toUpperCase());

        System.out.print("sayı : ");
        int sayi= scann.nextInt();

        for (int i=0;i<=sayi;i++){
            System.out.println("2 üzeri "+i+" : "+(Math.pow(2,i)));
        }

        /**
         * Ödev
         * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
         */
        String metin2="girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program";
        System.out.println("-----\n"+metin2.toUpperCase());

        System.out.print("sayı : ");
        int sayi2= scann.nextInt();

        for (int j=0;j<=sayi2;j++){
            System.out.println("4 üzeri "+j+" :"+(Math.pow(4,j)));
        }
        System.out.println("-----");
        for (int j=0;j<=sayi2;j++){
            System.out.println("5 üzeri "+j+" :"+(Math.pow(5,j)));
        }

    }
}
