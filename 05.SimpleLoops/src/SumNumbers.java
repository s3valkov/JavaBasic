import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++)  {
            int numbers = Integer.parseInt(scanner.nextLine());
            sum += numbers ;
        }
        System.out.println(sum);
    }
}
