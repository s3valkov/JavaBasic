import java.util.Scanner;
public class P01_TailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int table = Integer.parseInt(scanner.nextLine()) ;
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double areaCover = table *(length+ 2 * 0.3) * (width+ 2 * 0.30);
        double areaSquare = table * (length/2)*(length/2) ;
        double priceDollars = areaCover*7 + areaSquare*9 ;
        double priceLeva = priceDollars * 1.85 ;

            System.out.printf("%.2f USD \n" , priceDollars);
            System.out.printf("%.2f BGN " , priceLeva);

    }
}

