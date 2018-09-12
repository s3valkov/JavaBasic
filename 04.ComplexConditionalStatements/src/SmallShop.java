import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine().toLowerCase();
        String town = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());

        if (town.equals("sofia")) {
            switch (product) {
                case "coffee": System.out.println(quantity * 0.5);
                    break;
                case "water": System.out.println(quantity * 0.8);
                    break;
                case "beer": System.out.println(quantity * 1.2);
                    break;
                case "sweets": System.out.println(quantity * 1.45);
                    break;
                case "peanuts": System.out.println(quantity * 1.6);
                    break;
            }
        }

        if (town.equals("plovdiv")) {
            switch (product) {
                case "coffee": System.out.println(quantity * 0.4);
                    break;
                case "water": System.out.println(quantity * 0.7);
                    break;
                case "beer": System.out.println(quantity * 1.15);
                    break;
                case "sweets": System.out.println(quantity * 1.30);
                    break;
                case "peanuts": System.out.println(quantity * 1.5);
                    break;
            }
        }

        if (town.equals("varna")) {
            switch (product) {
                case "coffee": System.out.println(quantity * 0.45);
                    break;
                case "water": System.out.println(quantity * 0.7);
                    break;
                case "beer": System.out.println(quantity * 1.1);
                    break;
                case "sweets": System.out.println(quantity * 1.35);
                    break;
                case "peanuts": System.out.println(quantity * 1.55);
                    break;
            }
        }
    }
}
