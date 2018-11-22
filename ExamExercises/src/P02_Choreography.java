import java.util.Scanner;

public class P02_Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int step = Integer.parseInt(scanner.nextLine());
        int dancer = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        double procent = (((double) step / (double) days) / (double) step) * 100;
        double procentStep = Math.ceil(procent) / dancer;

        if (procent > 13) {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.", procentStep);
        } else {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", procentStep);
        }
    }
}
