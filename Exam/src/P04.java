import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int sumOut = 0;
        int sumIn = 0;

        if (n % 2 == 1) {
            people += 2;
        }

        for (int i = 0; i < n; i++) {
            int out = Integer.parseInt(scanner.nextLine());
            int in = Integer.parseInt(scanner.nextLine());
            sumOut += out;
            sumIn += in;
        }

        int sum = (people + sumIn) - sumOut;
        System.out.printf("The final number of passengers is : %d", sum);
    }
}
