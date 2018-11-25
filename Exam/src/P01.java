import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kompot = Integer.parseInt(scanner.nextLine());
        int konfitur = Integer.parseInt(scanner.nextLine());

        double priceKompot = (kompot + 1) * 0.3 * 1.05;
        double priceKonfitur = (konfitur + 1) * 0.65 * 1.10;

        double sum = (priceKompot + priceKonfitur) * 3.2;
        System.out.printf("%.02f", sum);
    }
}
