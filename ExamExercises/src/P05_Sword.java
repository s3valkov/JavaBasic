import java.util.Scanner;

public class P05_Sword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int dies = n - 2;
        int width = (2 * n) + 1;
        //top
        System.out.printf("%s/^\\%s%n",
                repeatStr("#", n - 1),
                repeatStr("#", n - 1));

        for (int i = 0; i < n / 2; i++) {
            System.out.printf("%s.%s.%s%n",
                    repeatStr("#", dies),
                    repeatStr(" ", 3 + 2 * i),
                    repeatStr("#", dies));
            dies--;

        }
        //middle
        int diesSec = (n - 1) / 2;
        int space = (width - 2 * diesSec - 3) / 2;
        System.out.printf("%s|%sS%s|%s%n",
                repeatStr("#", diesSec),
                repeatStr(" ", space),
                repeatStr(" ", space),
                repeatStr("#", diesSec));
        System.out.printf("%s|%sO%s|%s%n",
                repeatStr("#", diesSec),
                repeatStr(" ", space),
                repeatStr(" ", space),
                repeatStr("#", diesSec));
        System.out.printf("%s|%sF%s|%s%n",
                repeatStr("#", diesSec),
                repeatStr(" ", space),
                repeatStr(" ", space),
                repeatStr("#", diesSec));
        System.out.printf("%s|%sT%s|%s%n",
                repeatStr("#", diesSec),
                repeatStr(" ", space),
                repeatStr(" ", space),
                repeatStr("#", diesSec));
        for (int i = 0; i < n - 4; i++) {
            System.out.printf("%s|%s %s|%s%n",
                    repeatStr("#", diesSec),
                    repeatStr(" ", space),
                    repeatStr(" ", space),
                    repeatStr("#", diesSec));
        }
        System.out.printf("%s|%sU%s|%s%n",
                repeatStr("#", diesSec),
                repeatStr(" ", space),
                repeatStr(" ", space),
                repeatStr("#", diesSec));
        System.out.printf("%s|%sN%s|%s%n",
                repeatStr("#", diesSec),
                repeatStr(" ", space),
                repeatStr(" ", space),
                repeatStr("#", diesSec));
        System.out.printf("%s|%sI%s|%s%n",
                repeatStr("#", diesSec),
                repeatStr(" ", space),
                repeatStr(" ", space),
                repeatStr("#", diesSec));
        System.out.printf("@%s@%n",
                repeatStr("=", width - 2));
        int diess = (n + 3) / 2;
        for (int i = 0; i < n / 2; i++) {

            System.out.printf("%s|%s|%s%n",
                    repeatStr("#", diess),
                    repeatStr(" ", width - 2 * diess - 2),
                    repeatStr("#", diess));
        }
        System.out.printf("%s\\%s/%s%n",
                repeatStr("#", diess),
                repeatStr(".", width - 2 * diess - 2),
                repeatStr("#", diess));
    }

    static String repeatStr(String strToRepeat, int count) {
        StringBuilder sb = new StringBuilder();
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }
}
