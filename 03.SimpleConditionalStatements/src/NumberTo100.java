import java.util.Scanner;

public class NumberTo100 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        int firstnum = num / 10, secnum = num % 10, bothnum = num;
        String secword = "", firstword = "", bothword = "";

        switch (secnum){
            case 0: secword = "zero"; break;
            case 1: secword = "one"; break;
            case 2: secword = "two"; break;
            case 3: secword = "three"; break;
            case 4: secword = "four"; break;
            case 5: secword = "five"; break;
            case 6: secword = "six"; break;
            case 7: secword = "seven"; break;
            case 8: secword = "eight"; break;
            case 9: secword = "nine"; break;
            default: break;
        }
        switch (firstnum) {
            case 2: firstword = "twenty"; break;
            case 3: firstword = "thirty"; break;
            case 4: firstword = "forty"; break;
            case 5: firstword = "fifty"; break;
            case 6: firstword = "sixty"; break;
            case 7: firstword = "seventy"; break;
            case 8: firstword = "eighty"; break;
            case 9: firstword = "ninety"; break;
            default: break;
        }
        switch (bothnum){
            case 10: bothword = "ten"; break;
            case 11: bothword = "eleven"; break;
            case 12: bothword = "twelve"; break;
            case 13: bothword = "thirteen"; break;
            case 14: bothword = "fourteen"; break;
            case 15: bothword = "fifteen"; break;
            case 16: bothword = "sixteen"; break;
            case 17: bothword = "seventeen"; break;
            case 18: bothword = "eighteen"; break;
            case 19: bothword = "nineteen"; break;
            default: break;
        }
        if (num >= 0 && num <= 9){ System.out.println(secword); }
        else if (num >= 10 && num <= 19) { System.out.println(bothword); }
        else if (num >= 20 && num <= 100) {
            if (num % 10 == 0 && num != 10 && num != 100) { System.out.println(firstword); }
            else if (num == 100) { System.out.println("one hundred"); }
            else { System.out.println(firstword + " " + secword); }
        }
        else { System.out.println("invalid number"); }
    }
}


