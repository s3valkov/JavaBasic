import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            sum +=numbers ;

            if (numbers > max) {
                max = numbers ;
            }
        }
        int newSum = sum - max ;
        if (newSum == max) {
            System.out.println("Yes Sum = " +newSum);
        }
        else {
            System.out.println("No Diff = " +Math.abs(newSum-max));
        }
    }
}
