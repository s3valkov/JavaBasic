import java.util.Scanner;

public class P03_Aquapark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine().toLowerCase();
        int hour = Integer.parseInt(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        String period = scanner.nextLine().toLowerCase();

        double price = 0;

        if ((month.equals("january") || month.equals("february")|| month.equals("march") || month.equals("april") ||
                month.equals("may")) && period.equals("day")) {
            price = 10.5;
        }
        else if ((month.equals("january") || month.equals("february")|| month.equals("march") || month.equals("april") ||
                month.equals("may")) && period.equals("night")) {
            price = 8.4;
        }
        else if ((month.equals("june") || month.equals("july") || month.equals("august") || month.equals("september")
                || month.equals("october") || month.equals("november") || month.equals("december")) && period.equals("day")) {
            price = 12.6;
        }
        else {
            price = 10.2;
        }

        if (people >=4) {
            price *= 0.9;
        }
        if (hour >=5) {
            price *= 0.5;
        }

        double sum = price * people * hour;

        System.out.printf("Price per person for one hour: %.02f%n" ,price);
        System.out.printf("Total cost of the visit: %.02f" ,sum);
    }
}
