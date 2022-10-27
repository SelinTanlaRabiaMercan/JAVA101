import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int satirsayisi;
    int sutunsayisi;
    int[][] map;
    int[][] ikincitahta;
    boolean game = true;
    int size;

    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    MineSweeper(int satirsayisi, int sutunsayisi) {
        this.sutunsayisi = sutunsayisi;
        this.satirsayisi = satirsayisi;
        this.map = new int[satirsayisi][sutunsayisi];
        this.ikincitahta = new int[satirsayisi][sutunsayisi];
        this.size = satirsayisi * sutunsayisi;
    }

    public void hazirlik() {
        int rasgelesatir, rasgelesutun, adet = 0;
        while (adet != (size / 4)) {
            rasgelesatir = random.nextInt(satirsayisi);
            rasgelesutun = random.nextInt(sutunsayisi);

            if (map[rasgelesatir][rasgelesutun] != -1) {
                map[rasgelesatir][rasgelesutun] = -1;
                adet++;
            }
        }
    }

    public void yazdir(int [][]dizi) {
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {//sutun
               /* if (dizi[i][j]>0) {
                    System.out.print(dizi[i][j]+" ");
                }*/
                if(dizi[i][j]==-1){
                    System.out.print(" * ");
                }
                if(dizi[i][j]==0){
                    System.out.print(" - ");
                }
                //System.out.print(" + ");
                if(dizi[i][j]>0){
                    System.out.print(dizi[i][j]+" ");
                }
                //System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void yazdir2(int [][]dizi) {
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[0].length; j++) {//sutun
               /* if (dizi[i][j]>0) {
                    System.out.print(dizi[i][j]+" ");
                }*/
                System.out.print(" + ");
                //System.out.print(dizi[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void run(){
        int satir,sutun,basari=0;
        hazirlik();
        yazdir(map);
        System.out.println("welcome to do game");
        while (game){
            yazdir(ikincitahta);
            System.out.print("satır : ");
            satir= scanner.nextInt();
            System.out.print("sutun : ");
            sutun= scanner.nextInt();

            if(satir<0||satir>=satirsayisi){
                System.out.println("geçersiz koordinat");
            }
            if(sutun<0||sutun>=sutunsayisi){
                System.out.println("geçersiz koordinta");
            }

            if(map[satir][sutun]==-1){
                System.out.println("game overr");
                break;
            }

            if(map[satir][sutun]==0){
                check(satir,sutun);
                basari++;
                if(basari==(size-(size/4))){
                    System.out.println("oyunu kazandınız");
                    break;
                }
               /* if(basari!=(size-(size/4))){
                    System.out.println("kaybettiniz");
                    game=false;
                }*/
            }
            System.out.println("başarı : "+basari);
          /*  if(map[satir][sutun]==-1){
                System.out.println("bombaya bastınız");
                game=false;
            }*/
        }
    }
    public void check(int sasa,int susu){
        if(map[sasa][susu]==0){
            if((sasa<satirsayisi-1)&&(map[sasa+1][susu]==-1)){//alt
                ikincitahta[sasa][susu]++;
            }
            if((susu<sutunsayisi-3)&&(map[sasa][susu+1]==-1)){//sağ
                ikincitahta[sasa][susu]++;
            }
            if((sasa>0)&&(map[sasa-1][susu]==-1)){//üst
                ikincitahta[sasa][susu]++;
            }
            if((susu>0)&&(map[sasa][susu-1]==-1)){//sol
                ikincitahta[sasa][susu]++;
            }
            if(ikincitahta[sasa][susu]==0){
                ikincitahta[sasa][susu]=-2;
            }
           /* if((susu>0&&sasa>0)&&(map[sasa-1][susu-1]==-1)){//sol üst
                ikincitahta[sasa][susu]++;
            }
            if((sasa<satirsayisi-1&&susu<sutunsayisi-1)&&
                    (map[sasa+1][susu+1]==-1)){//alt sol
                ikincitahta[sasa][susu]++;
            }
            if((sasa<satirsayisi-1&&susu<sutunsayisi+1)&&
                    (map[sasa+1][susu-1]==-1)){//alt sağ
                ikincitahta[sasa][susu]++;
            }*/
        }
    }
}



