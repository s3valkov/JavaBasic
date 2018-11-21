import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= n  ; i++) {
            System.out.print(repeatStr(" ",n - i )+repeatStr("*", i));
            System.out.print( repeatStr(" | ", 1));
            System.out.print(repeatStr("*", i));
            System.out.println();

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
