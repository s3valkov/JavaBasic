import java.util.Scanner;

public class P01_Voluntary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int cookers = Integer.parseInt(scanner.nextLine());
        int cake = Integer.parseInt(scanner.nextLine());
        int goffret = Integer.parseInt(scanner.nextLine());
        int pancake = Integer.parseInt(scanner.nextLine());

        double allMoney = (pancake * 3.2 + cake * 45 + goffret * 5.8) * days * cookers ;
        double voluntaryMoney = (allMoney - ( allMoney * 0.125 )) ;

        System.out.printf("%.2f" ,voluntaryMoney);
    }
}
