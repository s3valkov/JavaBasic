import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine().toLowerCase();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());

        double result = 1;

        switch (type) {
            case "premiere": System.out.printf("%.2f", result * 12 * row * column);
                break;
            case "normal": System.out.printf("%.2f", result * row * column * 7.5);
                break;
            case "discount": System.out.printf("%.2f", result * 5 * row * column);
                break;
        }
    }
}
