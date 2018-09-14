import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int nextSum = 0;
        int couples = 0;
        int maxDiff = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        sum = firstNum + secondNum;
        if (sum == nextSum) {
            couples++;
        }
        if (maxDiff < Math.abs(nextSum - sum) && i >=1) {
            maxDiff = Math.abs(nextSum - sum);
        }
        if (!(sum == nextSum)) {
            nextSum =sum;
        }
        }

        if (couples == n - 1) {
            System.out.println("Yes, value=" + sum);
        }
        else {
            System.out.println("No.maxdiff=" + maxDiff);
        }
    }
}