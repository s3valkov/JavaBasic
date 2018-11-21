import java.util.Scanner;

public class Castle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
       System.out.printf("/%s\\%s/%s\\%n", repeatStr("^",n / 2),
                repeatStr("_", 2 * n - 2 * (n / 2) - 4),
                repeatStr("^",n / 2));
        for (int i = 0; i <= n - 3; i++) {
            if (i != (n - 3)) {
                System.out.printf("|%s|%n",repeatStr(" ", 2 * n - 2));
            }
            else {
                System.out.printf("|%s%s%s|%n",repeatStr(" ",n/2 + 1),
                        repeatStr("_", 2 * n - 2 * (n / 2) - 4 ),
                        repeatStr(" ", n / 2 + 1));
            }
        }

        System.out.printf("\\%s/%s\\%s/%n", repeatStr("_",n / 2),
                repeatStr(" ", 2 * n - 2 * (n / 2) - 4),
                repeatStr("_",n / 2));
    }

    static String repeatStr(String strToRepeat, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;

    }
}

