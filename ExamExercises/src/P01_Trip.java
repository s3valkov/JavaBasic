import java.util.Scanner;

public class P01_Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x = Double.parseDouble(scanner.nextLine());
        double v = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        double carSpeed = y * 3.6 + v;
        double truckTime = x / v;
        double carTime = x / carSpeed;

        System.out.printf("The truck arrived after %.0f hours%n" ,Math.ceil(truckTime));
        System.out.printf("The car arrived after %.0f hours" ,Math.ceil(carTime));

    }
}
