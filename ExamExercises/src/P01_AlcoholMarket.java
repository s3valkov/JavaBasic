import  java.util.Scanner;
public class P01_AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceWhiskey = Double.parseDouble(scanner.nextLine());

        double priceRakiq = priceWhiskey / 2 ;
        double priceWine = priceRakiq - (0.4 * priceRakiq);
        double priceBeer = priceRakiq - (0.8 * priceRakiq);

        double litersBeer = Double.parseDouble(scanner.nextLine());
        double litersWine = Double.parseDouble(scanner.nextLine());
        double litersRakiq = Double.parseDouble(scanner.nextLine());
        double litersWhiskey = Double.parseDouble(scanner.nextLine());

        double priceAlcohol = (litersBeer * priceBeer) + (litersRakiq * priceRakiq) + (litersWhiskey * priceWhiskey) + (litersWine * priceWine) ;

            System.out.printf("%.2f" , priceAlcohol);


    }
}
