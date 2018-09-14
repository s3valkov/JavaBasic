import java.util.Scanner;

public class EverOrOdd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum +=numbers ;
            }
            else {
                oddSum +=numbers;
            }
        }
        if (evenSum == oddSum) {
            System.out.println("Yes Sum =" +evenSum);
        }
        else {
            int diff = Math.max(evenSum,oddSum) - Math.min(evenSum,oddSum) ; //or with Math.abs()
            System.out.println("No Diff = " +diff);
        }

    }
}
