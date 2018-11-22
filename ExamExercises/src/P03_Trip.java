import java.util.Scanner;

public class P03_Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();
        switch (season) {
            case "summer":
                if (budget <= 100) {
                    budget = (budget * 30) / 100;
                    System.out.printf("Somewhere in Bulgaria\nCamp - %.2f", budget);
                } else if (budget > 100 && budget <= 1000) {
                    budget = (budget * 40) / 100;
                    System.out.printf("Somewhere in Balkans\nCamp - %.2f", budget);
                } else if (budget > 1000) {
                    budget = (budget * 90) / 100;
                    System.out.printf("Somewhere in Europe\nHotel - %.2f", budget);
                }
                break;
            case "winter":
                if (budget <= 100) {
                    budget = (budget * 70) / 100;
                    System.out.printf("Somewhere in Bulgaria\nHotel - %.2f", budget);
                } else if (budget > 100 && budget <= 1000) {
                    budget = (budget * 80) / 100;
                    System.out.printf("Somewhere in Balkans\nHotel - %.2f", budget);
                } else if (budget > 1000) {
                    budget = (budget * 90) / 100;
                    System.out.printf("Somewhere in Europe\nHotel - %.2f", budget);
                }
                break;
        }
    }
}
