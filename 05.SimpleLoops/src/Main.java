import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double OddMax = Double.MIN_VALUE;
        double OddMin = Double.MAX_VALUE;
        double EvenMax = Double.MIN_VALUE;
        double EvenMin = Double.MAX_VALUE;
        double OddSum = Double.MIN_VALUE;
        double EvenSum = Double.MIN_VALUE;

        if (n == 0) {
            System.out.println("OddSum=0,");
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.println("EvenSum=0,");
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {

            for (double i = 1; i <= n; i++) {
                double number = Double.parseDouble(scanner.nextLine());
                if (n == 1) {
                    OddMax = number;
                    OddMin = number;
                    OddMax = number;
                    EvenSum = 0;

                }
                if (i % 2 == 0) {
                    EvenSum += number;
                    if (number > EvenMax) {
                        EvenMax = number;
                    }
                    if (number < EvenMin) {
                        EvenMin = number;
                    }
                } else {
                    OddSum += number;
                    if (number > OddMax) {
                        OddMax = number;
                    }
                    if (number < OddMin) {
                        OddMin = number;
                    }

                }

            }
            System.out.printf("OddSum=" + OddSum + ',');
            System.out.println();
            System.out.printf("OddMin=" + OddMin + ',');
            System.out.println();
            System.out.printf("OddMax=" + OddMax + ',');
            System.out.println();
            System.out.printf("EvenSum=" + EvenSum + ',');
            System.out.println();
            if (n == 1) {
                System.out.printf("EvenMin=No,");
                System.out.println();
                System.out.printf("EvenMax=No");
            } else {
                System.out.printf("EvenMin=" + EvenMin + ',');
                System.out.println();
                System.out.printf("EvenMax=" + EvenMax);
            }

        }
    }
}