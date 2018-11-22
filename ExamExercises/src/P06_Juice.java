import java.util.Scanner;

public class P06_Juice {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int r = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int juice = Integer.parseInt(scanner.nextLine());
        int rSum = 0;
        int sSum = 0;
        int cSum = 0;
        double juiceSum = 0;

        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= s; j++) {
                for (int k = 0; k <= c; k++) {
                    double juiceTotal = i * 15 + s * 7.5 + c * 4.5;

                    if (juiceTotal <= juice) {
                        if (juiceTotal > juiceSum) {
                            juiceSum = juiceTotal;
                        }
                    }
                }

            }
        }
    }
}
