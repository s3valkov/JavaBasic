import java.util.Scanner;

public class P02_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int chocolate = Integer.parseInt(scanner.nextLine());
        double milk  = Double.parseDouble(scanner.nextLine());

        double moneyMilk = milk * 2.7;
        double moneyChoco = chocolate * 0.65;
        double orange = chocolate - (chocolate * 0.35);
        double moneyOrange = Math.floor(orange) * 0.2;
        double sum = moneyChoco + moneyMilk + moneyOrange;

        if (budget >= sum) {
            System.out.printf("You got this, %.02f money left!" ,budget - sum);
        }
        else {
            System.out.printf("Not enough money, you need %.02f more!" , sum - budget);
        }
    }
}
