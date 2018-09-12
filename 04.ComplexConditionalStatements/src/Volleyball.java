import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String year = scanner.nextLine().toLowerCase();
        int p = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double days = (48 - h) * (3.0/4.0) + p * (2.0/3.0) + h;
        double result = 0.0;

        switch (year) {
            case "leap":
                result = (days * 1.15);
                System.out.printf("%.0f" , Math.floor(result));
                break;
            case "normal":
                System.out.printf("%.0f" , Math.floor(days));
                break;
        }
    }
}
