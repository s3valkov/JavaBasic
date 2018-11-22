    import java.util.Scanner;

    public class P03_SlotMachine {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            char n = scanner.nextLine().charAt(0);
            int n1 = Integer.parseInt(scanner.nextLine());
            char m = scanner.nextLine().charAt(0);
            int m1 = Integer.parseInt(scanner.nextLine());
            char k = scanner.nextLine().charAt(0);
            int k1 = Integer.parseInt(scanner.nextLine());

            int sum1 = (int)n + n1 ;
            int sum2 = (int)m + m1 ;
            int sum3 = (int)k + k1 ;

            if (sum1 == 64 && sum2 == 64 && sum3 == 64) {
                System.out.printf("@@@%n!!! YOU LOSE EVERYTHING !!!");
            }
            else if (sum1 == 55 && sum2 == 55 && sum3 == 55) {
                System.out.printf("777%n*** JACKPOT ***");
            }
            else {
                System.out.printf("%c%c%c" ,sum1, sum2, sum3);
            }
        }
    }
