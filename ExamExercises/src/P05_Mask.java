import java.util.Scanner;

public class P05_Mask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int to4ki = 2 * n;
        int space = n - 2;

        //top
        for (int i = 0; i < n - 1 ; i++) {
            System.out.printf("%s/%s|  |%s\\%n",repeatStr(" ", space),
                    repeatStr(" ",i),repeatStr(" ", i),
                    repeatStr(" ",space));
            space--;
        }

        //center
        System.out.printf("%s%n",repeatStr("-", (2* n) + 2));
        //n + n % 3;
        for (int i = 0; i < n + n % 3 ; i++) {
            if (i == 0) {
                System.out.printf("|%s_%s_%s|%n",repeatStr(" ",n / 3),
                        repeatStr(" ",n + 1),
                        repeatStr(" ",n / 3));
            }
            else if (i == 1){
                System.out.printf("|%s@%s@%s|%n",repeatStr(" ",n / 3),
                        repeatStr(" ",n + 1),
                        repeatStr(" ",n / 3));
            }
            else if (i == (n + n % 3) - 3){
                System.out.printf("|%sOO%s|%n",repeatStr(" ",n - 1),
                        repeatStr(" ",n - 1));
            }
            else if (i == (n + n % 3) - 2){
                System.out.printf("|%s/  \\%s|%n",repeatStr(" ",n - 2 ),
                        repeatStr(" ",n - 2));
            }
            else if (i == (n + n % 3) - 1){
                System.out.printf("|%s||||%s|%n",repeatStr(" ",n - 2),
                        repeatStr(" ",n - 2));
            }
            else {
                System.out.printf("|%s|%n",repeatStr(" ",2 * n));

            }
        }


        //bottom
        for (int i = 0; i < n + 1 ; i++) {
            System.out.printf("%s%s%s%n" , repeatStr("\\",i + 1),
                    repeatStr("`",to4ki),repeatStr("/",i + 1));
            to4ki -= 2;
        }


    }
    static String repeatStr(String strToRepeat, int count){
        StringBuilder sb = new StringBuilder();
        String text = "";
        for (int i = 0; i < count; i++) {
            text = text + strToRepeat;
        }
        return text;
    }

}
