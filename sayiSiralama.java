import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Ödev
        Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
        */
        System.out.println("SAYILARI SIRALAMA");
        Scanner scan=new Scanner(System.in);

        int bs=0,ks=0,o=0;

        System.out.print("1.sayi : ");
        int a= scan.nextInt();
        System.out.print("2.sayi : ");
        int b= scan.nextInt();
        System.out.print("3.sayi : ");
        int c= scan.nextInt();

        if (a>b){
            if(a<c){
                bs=c;
                ks=b;
                o=a;
            }
            if(a>c){
                bs=a;
                if (b>c){
                    ks=c;
                    o=b;
                }
                if(c>b){
                    ks=b;
                    o=c;
                }
            }
        }
        if (b>a){
            if(b>c){
                bs=b;
                if(a<c){
                    ks=a;
                    o=c;
                }
                if(c<a){
                    ks=c;
                    o=a;
                }
            }
            if(c>b){
                bs=c;
                ks=a;
                o=b;
            }
        }
        System.out.println(bs+">"+o+">"+ks);

    }
}
