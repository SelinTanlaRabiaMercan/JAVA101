import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("MATRİS TRANSPOZU");

        int[][] matris = {{1, 2, 3}, {4, 5, 6}};
        int[][] transpoze = new int[3][2];
        System.out.println("Matris");
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 3; ++j) {
                System.out.print(matris[i][j] + " ");

            }
            System.out.println();
        }

        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 3; ++j) {
                transpoze[j][i] = matris[i][j];
                //System.out.print(transpoze[j][i]+" ");
            }
            //System.out.println();
        }
        System.out.println("Transpoze");
        for (int[] tr : transpoze) {
            System.out.println(Arrays.toString(tr));
        }
    }
}
