import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("---MAYIN TARLASI---");
        Scanner scanner = new Scanner(System.in);
        System.out.print("oyun kaç satırdan oluşsun : ");
        int sat = scanner.nextInt();
        System.out.print("Oyun kaç sutundan oluşsun : ");
        int sut = scanner.nextInt();
        MineSweeper mineSweeper = new MineSweeper(sat, sut);
        mineSweeper.run();
    }
}