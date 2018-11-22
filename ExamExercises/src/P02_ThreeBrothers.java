import java.util.Scanner;

public class P02_ThreeBrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstTime = Double.parseDouble(scanner.nextLine());
        double secondTime = Double.parseDouble(scanner.nextLine());
        double thirdTime = Double.parseDouble(scanner.nextLine());
        double dadTime = Double.parseDouble(scanner.nextLine());

        double sumTime = 1 / (1 / firstTime + 1 / secondTime + 1 / thirdTime);
        double cleanTime = sumTime * 0.15 + sumTime;

        System.out.printf("Cleaning time: %.2f\n", cleanTime);

        if (cleanTime > dadTime) {
            double leftTime = cleanTime - dadTime;
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", Math.ceil(leftTime));
        } else {
            double secLeftTime = dadTime - cleanTime;
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", Math.floor(secLeftTime));
        }

    }
}
