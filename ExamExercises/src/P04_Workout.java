import java.util.Scanner;

public class P04_Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double km = Double.parseDouble(scanner.nextLine());

        double sum = km;

        for (int i = 0; i < n; i++) {
            double procent = Double.parseDouble(scanner.nextLine());
            km = km + km * (procent / 100);
            sum += km;
        }

        if (1000 > sum) {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - sum));
        } else {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(sum - 1000));
        }

    }
}
