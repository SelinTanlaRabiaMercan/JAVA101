import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.
         */
        Scanner scann = new Scanner(System.in);
        String metin = "Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.";
        System.out.println(metin.toUpperCase());

        System.out.print("sayı adeti : ");
        int adet=scann.nextInt();

        int max=0,min=0,deneme=0;
        System.out.println("-----");

        for (int i=1;i<=adet;i++){
            System.out.print(i+".sayı : ");
            int sayi= scann.nextInt();
            if(i == 1) {
                max=sayi;
                min=sayi;
            }
            if(sayi>max){
                max=sayi;
            }
            if(sayi<max){
                min=sayi;
            }
        }
        System.out.println("-----");
        System.out.println("max : "+max);
        System.out.println("min : "+min);


    }
}
