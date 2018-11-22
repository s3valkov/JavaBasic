import java.util.Scanner;

public class P04_ASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sumNum = 0;
        int sumAlfa = 0;
        int sumSmall = 0;
        int sumSymbol = 0;
        String type1 = "";
        String type2 = "";
        String type3 = "";
        String type4 = "";

        for (int i = 0; i < n; i++) {
            char a = scanner.nextLine().charAt(0);
            if ((int) a >= 48 && (int) a <= 57) {
                sumNum += (int) a;
                type1 += a;
            }
            else if ((int) a >= 65 && (int) a <= 90){
                sumAlfa += (int) a;
                type2 += a;
            }
            else if ((int) a >= 97 && (int) a <= 122){
                sumSmall += (int) a;
                type3 += a;
            }
            else {
                sumSymbol += (int) a;
                type4 += a;
            }
        }

        if (sumNum >= sumAlfa && sumNum >= sumSmall && sumNum >= sumSymbol) {
            System.out.printf("Biggest ASCII sum is:%d%n" ,sumNum);
            System.out.printf("Combination of characters is:%s%n" ,type1);
        }
        else if (sumAlfa >= sumSmall && sumAlfa >= sumSymbol) {
            System.out.printf("Biggest ASCII sum is:%d%n" ,sumAlfa);
            System.out.printf("Combination of characters is:%s%n" ,type2);
        }
        else if (sumSmall >=sumSymbol) {
            System.out.printf("Biggest ASCII sum is:%d%n" ,sumSmall);
            System.out.printf("Combination of characters is:%s%n" ,type3);
        }
        else {
            System.out.printf("Biggest ASCII sum is:%d%n" ,sumSymbol);
            System.out.printf("Combination of characters is:%s%n" ,type4);
        }
    }
}
