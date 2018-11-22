import java.util.Scanner;

public class P02_ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vacation = Double.parseDouble(scanner.nextLine());
        int puzzel = Integer.parseInt(scanner.nextLine());
        int puppet = Integer.parseInt(scanner.nextLine());
        int teddy = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        int sumToys = puppet + puzzel + truck + teddy + minion;
        double allMoney = puzzel * 2.6 + puppet * 3 + teddy * 4.1 + minion * 8.2 + truck * 2;

        if (sumToys >= 50) {
            double money = allMoney - (allMoney * 25) / 100;
            money -= (money * 10) / 100;
            if (money >= vacation) {
                System.out.printf("Yes! %.2f lv left.", money - vacation);
            } else {
                System.out.printf("Not enough money! %.2f lv needed.", vacation - money);
            }
        } else {
            allMoney -= (allMoney * 10) / 100;
            if (allMoney >= vacation) {
                System.out.printf("Yes! %.2f lv left.", allMoney - vacation);
            } else {
                System.out.printf("Not enough money! %.2f lv needed.", vacation - allMoney);
            }
        }
    }
}
