import java.util.Scanner;

public class P03_Arena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int point = Integer.parseInt(scanner.nextLine());
        String arena = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        String condition = scanner.nextLine().toLowerCase();

        int sum = 1;


        if (condition.equals("poor")) {
            sum = 7000;
        } else if (condition.equals("normal")) {
            sum = 14000;
        } else if (condition.equals("legendary")) {
            sum = 21000;
        }


        if ((day.equals("monday") || day.equals("wednesday"))&& arena.equals("nagrand") ) {
            sum *= 0.95;
        }
        else if ((day.equals("tuesday") || day.equals("thursday"))&& arena.equals("gurubashi") ) {
            sum *= 0.90;
        }
        else if ((day.equals("friday") || day.equals("saturday"))&& arena.equals("dire maul") ) {
            sum *= 0.93;
        }
        sum /= 5;
        int toy =  (int)(point / sum);
        double leftPoint = point % sum;
        double sucLeft = point - sum * 5;

        if (toy >= 5) {
            System.out.printf("Items bought: 5%n");
            System.out.printf("Arena points left: %.0f%n" , sucLeft);
            System.out.printf("Success!");
        }
        else if (toy < 5) {
            System.out.printf("Items bought: %d%n" , toy);
            System.out.printf("Arena points left: %.0f%n" , leftPoint);
            System.out.printf("Failure!");
        }
    }
}
