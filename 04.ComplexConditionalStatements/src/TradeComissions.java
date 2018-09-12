import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine().toLowerCase();
        double s = Double.parseDouble(scanner.nextLine());
        double comission = 0;

        if (s < 0) {
            System.out.printf("error");
        }
        else if (!(town.equals("varna")||town.equals("sofia") || town.equals("plovdiv"))) {
            System.out.println("error");
        }

        else if (town.equals("sofia")) {
            if (s >=0 && s <= 500) {
                comission = s * 0.05;
            }
            if (s > 500 && s <= 1000) {
                comission = s * 0.07;
            }
            if (s > 1000 && s <= 10000) {
                comission = s * 0.08;
            }
            if (s > 10000) {
                comission = s * 0.12;
            }
            System.out.printf("%.2f", comission);
        }
        else if (town.equals("varna")) {
            if (s >=0 && s <= 500) {
                comission = s * 0.045;
            }
            if (s > 500 && s <= 1000) {
                comission = s * 0.075;
            }
            if (s > 1000 && s <= 10000) {
                comission = s * 0.10;
            }
            if (s > 10000) {
                comission = s * 0.13;
            }
            System.out.printf("%.2f", comission);
        }
        else if (town.equals("plovdiv")) {
            if (s >=0 && s <= 500) {
                comission = s * 0.055;
            }
            if (s > 500 && s <= 1000) {
                comission = s * 0.08;
            }
            if (s > 1000 && s <= 10000) {
                comission = s * 0.12;
            }
            if (s > 10000) {
                comission = s * 0.145;
            }
            System.out.printf("%.2f", comission);
        }

    }
}

