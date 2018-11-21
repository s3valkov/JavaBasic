import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int asterix = 1;

        if (n % 2 == 0) {
            asterix++;
        }
        for (int i = 0; i < (n + 1) / 2; i++) {
            Integer padding = (n - asterix) / 2;
            System.out.printf("%s%s%s\n", repeatStr("-", padding), repeatStr("*", asterix), repeatStr("-", padding));
            asterix += 2;
        }
        for (int i = 0; i < n / 2; i++) {
            System.out.printf("|%s|\n", repeatStr("*", n - 2));
        }
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;

    }
}
