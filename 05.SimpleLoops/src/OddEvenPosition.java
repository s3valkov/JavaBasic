import java.util.Scanner;
import java.text.DecimalFormat;

public class OddEvenPosition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##################");
        int n = Integer.parseInt(scanner.nextLine());
        double oddSum= 0;
        double evenSum= 0;
        double evenMax= -1000000000.0;
        double evenMin= 1000000000.0;
        double oddMax= -1000000000.0;
        double oddMin= 1000000000.0;

        if (n == 0) {
            System.out.println("OddSum=0,");
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.println("EvenSum=0,");
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");

        }
        else if (n==1) {
            double num = Double.parseDouble(scanner.nextLine());
            System.out.printf("OddSum=%s,%n" ,df.format(num));
            System.out.printf("OddMin=%s,%n" ,df.format(num));
            System.out.printf("OddMax=%s,%n" ,df.format(num));
            System.out.println("EvenSum=0,");
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        }
        else {

            for (double i = 1; i <= n; i++) {
                double numbers = Double.parseDouble(scanner.nextLine());
                if (i % 2 == 0) {
                    evenSum += numbers;
                    if (evenMax < numbers) {
                        evenMax = numbers;
                    }
                    if (evenMin > numbers) {
                        evenMin = numbers;
                    }
                } else  {
                    oddSum += numbers;
                    if (oddMax < numbers) {
                        oddMax = numbers;
                    }
                    if (oddMin > numbers) {
                        oddMin = numbers;
                    }
                }
            }
            System.out.printf("Oddsum = %s,%n" ,df.format(oddSum));
            System.out.printf("Oddmin = %s,%n" ,df.format(oddMin));
            System.out.printf("Oddmax =%s,%n" ,df.format(oddMax));
            System.out.printf("Evensum =%s,%n" ,df.format(evenSum));
            System.out.printf("EvenMin=%s,%n" ,df.format(evenMin));
            System.out.printf("EvenMax=%s,%n" ,df.format(evenMax));
            }
        }
}


