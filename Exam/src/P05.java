import java.util.Scanner;

public class P05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int space = 2 * n;
        //top
        System.out.printf("/`%s%s/`I%s/`N%sN%n",
                repeatStr("P", 2 * n),
                repeatStr(" ", n),
                repeatStr(" ", n),
                repeatStr(" ", 2 * n + 1));
        //center
        for (int i = 0; i < 2 * n; i++) {
            if (i == (n - 1)) {
                System.out.printf("| %s%s| I%s| N%sN%sN%n",
                        repeatStr("P", 2 * n),
                        repeatStr(" ", n),
                        repeatStr(" ", n),
                        repeatStr(" ", i),
                        repeatStr(" ", space));

            } else if (i < n - 1) {
                System.out.printf("| P%sP%s| I%s| N%sN%sN%n",
                        repeatStr(" ", 2 * n - 2),
                        repeatStr(" ", n),
                        repeatStr(" ", n),
                        repeatStr(" ", i),
                        repeatStr(" ", space));
            } else {
                System.out.printf("| %s%s| I%s| N%sN%sN%n",
                        repeatStr("P", n / 2),
                        repeatStr(" ", ((3 * n) - n / 2)),
                        repeatStr(" ", n),
                        repeatStr(" ", i),
                        repeatStr(" ", space));
            }
            space--;
        }


        //bottom
        System.out.printf("\\_%s%s\\_I%s\\_N%sNN%n",
                repeatStr("P", n / 2),
                repeatStr(" ", (3 * n) - n / 2),
                repeatStr(" ", n),
                repeatStr(" ", 2 * n));


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
