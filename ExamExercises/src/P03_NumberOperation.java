import java.util.Scanner;

public class P03_NumberOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();

        switch (operation) {
            case "+":
                int result = n1 + n2;
                if (result % 2 == 0) {
                    System.out.printf("%d + %d = %d - even", n1, n2, result);
                } else {
                    System.out.printf("%d + %d = %d - odd", n1, n2, result);
                }
                break;
            case "-":
                int result2 = n1 - n2;
                if (result2 % 2 == 0) {
                    System.out.printf("%d - %d = %d - even", n1, n2, result2);
                } else {
                    System.out.printf("%d - %d = %d - odd", n1, n2, result2);
                }
                break;
            case "*":
                int result4 = n1 * n2;
                if (result4 % 2 == 0) {
                    System.out.printf("%d * %d = %d - even", n1, n2, result4);
                } else {
                    System.out.printf("%d * %d = %d - odd", n1, n2, result4);
                }
                break;
            case "/":
                double result3 = (double) n1 / (double) n2;
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    System.out.printf("%d / %d = %.2f", n1, n2, result3);
                }
                break;
            case "%":
                double result5 = (double) n1 % (double) n2;
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    System.out.printf("%d %% %d = %.0f", n1, n2, result5);
                }
                break;
        }
    }
}
