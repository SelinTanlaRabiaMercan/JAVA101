public class Main {
    public static void main(String[] args) {
        /*Dizideki Elemanların Ortalamasını Hesaplayan Program*/
        String metin = "Dizideki Elemanların Ortalamasını Hesaplayan Program";
        System.out.println(metin.toUpperCase());

        int[] dizi = {5, 3, 7, 33, 0, 8, 7, 45, 68, 98};
        int elemansay = dizi.length, i = 0;
        double total = 0;

        for (int dizim : dizi) {
            i++;
            total = total + dizim;
            System.out.println(i + ".eleman : " + dizim);
        }
        System.out.println("ortalama : " + (total / (elemansay)));

        /*Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
            Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi*/

        String metin2 = "Dizideki sayıların harmonik ortalamasını hesaplayan program";
        System.out.println(metin2.toUpperCase());

        Double[] dizi1 = {5.0, 3.0, 4.0};
        int j = 0;double toplam=0,tumtoplam=0;
        for (double dizi01 : dizi1) {
            j++;
            System.out.println(j + "/" + dizi01 + " harmanik serisi :");
            for (int k = 1; k <= dizi01; k++) {
                System.out.println(j + ".eleman:      " + k + "/" + dizi01 + " : " + (k / dizi01));
                toplam+=(k/dizi01);
                j++;
            }
            System.out.println("toplam : "+toplam);
            tumtoplam+=toplam;
            j = 0;
            toplam=0;

        }
        System.out.println("Harmanik seri ortalama : "+(3/tumtoplam));
    }
}
