import java.util.Scanner;

public class P01_PCStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double processorPrice = Double.parseDouble(scanner.nextLine());
        double videoPrice = Double.parseDouble(scanner.nextLine());
        double ramPrice = Double.parseDouble(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double currency = 1.57;
        double firstSum =  ((processorPrice + videoPrice) * currency) - ((processorPrice + videoPrice) * currency) * percent;
        double sum =  firstSum + ram * ramPrice * currency;

        System.out.printf("Money needed - %.02f leva." ,sum);

    }
}
