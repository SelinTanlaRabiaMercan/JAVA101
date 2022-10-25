import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] dizi = {3, 3, 54, 76, 34, 23, 45, 54, 76, 54};
   
        int[]count=new  int[dizi.length];
        System.out.println("TEKRAR EDEN SAYILAR \n" +
                "dizi : [3, 3, 54, 76, 34, 23, 45, 54, 76, 54]");
        for (int i = 0; i <dizi.length ; i++) {
            count[i]=1;
        }
        for (int i = 0; i < dizi.length; i++) {
            //System.out.println(dizi[i]);
            for (int j = 0; j < dizi.length; j++) {
                if ((i!=j)&&(dizi[i] == dizi[j])) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < dizi.length; i++) {
            //System.out.println(dizi[i]);
            for (int j = 0; j < dizi.length; j++) {
                if ((j!=i)&&(dizi[j] == dizi[i])) {
                    count[j]++;
                }
            }
        }

        for (int i = 0; i <dizi.length ; i++) {
            if(i!=0){
                System.out.println(dizi[i]+" "+count[i]+" kere tekrarladı");
            }
        }
    }
}
