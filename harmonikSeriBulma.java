import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *Java ile girilen sayının harmonik serisini bulan program yazacağız.
         * 1 + 1/2 + 1/3 + 1/4 + 1/5 + ...
         */
        Scanner scann=new Scanner(System.in);
        String metin="sayının harmonik serisini bulan program";
        System.out.println(metin.toUpperCase());

        System.out.print("sayı : ");
        double sayi= scann.nextDouble();
        double n=0,toplam=0;

        for(double i=1;i<=sayi;i++){
            n=1/i;
            System.out.println(1+"/"+i+" : "+(1/i));
            toplam+=n;
        }
        System.out.println("+_____________");
        System.out.println("toplam : "+toplam);


    }
}
