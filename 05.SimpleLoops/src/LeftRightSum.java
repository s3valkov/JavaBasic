import java.util.Scanner;

public class LeftRightSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0 ;
        int rightSum = 0;

        for (int i = 0; i < n ; i++) {
            int leftNums = Integer.parseInt(scanner.nextLine());
            leftSum += leftNums ;
        }
        for (int k = 0; k < n ; k++) {
            int rightNums = Integer.parseInt(scanner.nextLine());
            rightSum += rightNums;
        }
        if (leftSum == rightSum) {
            System.out.println("Yes, sum = " +leftSum);
        }
        else {
            int diff = Math.max(leftSum,rightSum) - Math.min(leftSum,rightSum);
            System.out.println("No, diff = " +diff);
        }
    }
}
