import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < (n-1); i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number > max) {
                max=number;
            }
        }
        System.out.println(max);
    }
}
