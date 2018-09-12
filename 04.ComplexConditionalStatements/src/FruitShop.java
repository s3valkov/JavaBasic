import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine().toLowerCase();
        String day = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
            switch (fruit) {
                case "banana": System.out.println(quantity * 2.5);
                    break;
                case "apple": System.out.println(quantity * 1.2);
                    break;
                case "orange": System.out.println(quantity * 0.85);
                    break;
                case "grapefruit": System.out.println(quantity * 1.45);
                    break;
                case "kiwi": System.out.println(quantity * 2.7);
                    break;
                case "pineapple": System.out.println(quantity * 5.5);
                    break;
                case "grapes": System.out.println(quantity * 3.85);
                    break;
                default: System.out.println("error");
                    break;
            }
        }else if (day.equals("saturday") || day.equals("sunday")) {

            switch (fruit) {
                case "banana": System.out.println(quantity * 2.7);
                    break;
                case "apple": System.out.println(quantity * 1.25);
                    break;
                case "orange": System.out.println(quantity * 0.90);
                    break;
                case "grapefruit": System.out.println(quantity * 1.60);
                    break;
                case "kiwi": System.out.println(quantity * 3.0);
                    break;
                case "pineapple": System.out.println(quantity * 5.6);
                    break;
                case "grapes": System.out.println(quantity * 4.2);
                    break;
                default: System.out.println("error");
                    break;
            }
        }
        else {
            System.out.println("error");
        }
    }
}