import java.util.Scanner;

public class P06_PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int d = Integer.parseInt(scanner.nextLine());

        int firstPair = a + c;
        int secondPair = b + d;

        for (int i = a; i <=firstPair; i++) {

            for (int j = b; j <= secondPair; j++) {
                boolean isFirstPair = true;
                boolean isSecondPair = true;
                for (int k = 2; k <= Math.sqrt(i) ; k++) {
                    if (i % k == 0) {
                        isFirstPair = false;
                        break;
                    }
                }
                    for (int k = 2; k <= Math.sqrt(j) ; k++) {
                        if (j % k == 0) {
                            isSecondPair = false;
                            break;
                        }}
                        if (isFirstPair == true && isSecondPair == true) {
                        System.out.printf("%d%d%n",i,j); }
                    }
                }
            }
        }


