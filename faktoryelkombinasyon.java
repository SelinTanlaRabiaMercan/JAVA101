import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         *Java ile faktöriyel hesaplayan program yazıyoruz.
         */
        Scanner scann=new Scanner(System.in);
        String metin="faktöriyel hesaplayan program";
        System.out.println(metin.toUpperCase());

        System.out.print("sayı : ");
        int sayi= scann.nextInt();

        int faktoriyel=1;
        for (int i=sayi;i>=1;i--){
            faktoriyel*=i;
        }
        System.out.println("faktoriyel : "+faktoriyel+"\n-----");

        /*
        *  Ödev
        *N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li
        *kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
        *Java ile kombinasyon hesaplayan program yazınız.
        *Kombinasyon formülü
        *C(n,r) = n! / (r! * (n-r)!)
        * */

        String metin2="kombinasyon hesaplayan program";
        System.out.println(metin2.toUpperCase());

        System.out.print("n (eleman sayısı) : ");
        int n= scann.nextInt();
        System.out.print("r (seçim sayısı) : ");
        int r= scann.nextInt();

        int faktoriyelr=1,faktoriyeln=1,fkt=1;
        int islem=n-r;
        for (int a=1;a<=n;a++){
            faktoriyeln*=a;
        }
        for (int b=1;b<=r;b++){
            faktoriyelr*=b;
        }//C(n,r) = n! / (r! * (n-r)!)
        for (int f=1;f<=islem;f++){
            fkt*=f;
        }
        int c=faktoriyeln/(faktoriyelr*fkt);
        System.out.println("kombinasyon : "+c);

    }
}
