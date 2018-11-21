import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < (2 * (n - 2) + 1) / 2 ; i++) {
            if (i % 2 == 0) {
                System.out.printf("%s\\%s/%s%n",
                        repeatStr("*",n - 2),
                        repeatStr(" ",1),
                        repeatStr("*",n - 2));
            }
            else {
                System.out.printf("%s\\%s/%s%n",
                        repeatStr("-",n - 2),
                        repeatStr(" ",1),
                        repeatStr("-",n - 2));
            }
        }
        //middle
        System.out.printf("%s@%s%n",
                repeatStr(" ", n -1),
                repeatStr(" ", n -1));

        //bottom
        for (int i = 0; i < (2 * (n - 2) + 1) / 2 ; i++) {
            if (i % 2 == 0) {
                System.out.printf("%s/%s\\%s%n",
                        repeatStr("*",n - 2),
                        repeatStr(" ",1),
                        repeatStr("*",n - 2));
            }
            else {
                System.out.printf("%s/%s\\%s%n",
                        repeatStr("-",n - 2),
                        repeatStr(" ",1),
                        repeatStr("-",n - 2));
            }
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


