import java.util.Scanner;

public class P01_Birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double result = (length * width * height) * 0.001;
        double finalPercent = percent * 0.01;
        double finalResult = result * (1 - finalPercent);

        System.out.printf("%.3f", finalResult);
    }
}
