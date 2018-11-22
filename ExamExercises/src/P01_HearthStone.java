import java.util.Scanner;

public class P01_HearthStone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restTime = Integer.parseInt(scanner.nextLine());
        double cardPrice = Double.parseDouble(scanner.nextLine());
        double adventurePrice = Double.parseDouble(scanner.nextLine());
        double caffePrice = Double.parseDouble(scanner.nextLine());

        double sum = 2 * adventurePrice + 3 * cardPrice + caffePrice;
        int time = restTime - (5 + 5 * 2);

        System.out.printf("%.02f%n%d",sum, time);
    }
}
