import java.util.Scanner;

public class P03_Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        String hotel = scanner.nextLine().toLowerCase();
        String transport = scanner.nextLine().toLowerCase();
        double sum1 = 0;
        double sum2 = 0;
        switch (hotel) {
            case "miami":
                if ( day >= 1 && day <= 10){
                sum1 = 2 * 24.99 + 3 * 14.99;
                }
                else if (day >= 11 && day < 15) {
                    sum1 = 2 * 22.99 + 3 * 11.99;
                }
                else {
                    sum1 = 2 * 20 + 3 * 10;
                }
                    break;
            case "canary islands":
                if ( day >= 1 && day <= 10){
                    sum1 = 2 * 32.5 + 3 * 28.5;
                }
                else if (day >= 11 && day < 15) {
                    sum1 = 2 * 30.5 + 3 * 25.6;
                }
                else {
                    sum1 = 2 * 28 + 3 * 22;
                }
                break;
            case "philippines":
                if (day >= 1 && day <= 10){
                    sum1 = 2 * 42.99 + 3 * 39.99;
                }
                else if (day >= 11 && day < 15) {
                    sum1 = 2 * 41 + 3 * 36;
                }
                else {
                    sum1 = 2 * 38.50 + 3 * 32.4;
                }
                break;
        }

        if(transport.equals("train")){
            sum2 = 2 * 22.3 + 3 * 12.5;
        }
        else if (transport.equals("bus")){
            sum2 = 2 * 45 + 3 * 37;
        }
        else if (transport.equals("airplane")){
            sum2 = 2 * 90 + 3 * 68.5;
        }

        sum1 *= day;
        sum1 *= 1.25;
        double sum = sum1 + sum2;

        System.out.printf("%.03f" ,sum);
    }
}
