import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int num;
        switch (str) {
            case "one":
                num = 1;
                break;
            case "two":
                num = 2;
                break;
            case "three":
                num = 3;
                break;
            case "four":
                num = 4;
                break;
            case "five":
                num = 5;
                break;
            case "six":
                num = 6;
                break;
            case "seven":
                num = 7;
                break;
            case "eight":
                num = 8;
                break;
            default:
                num = 9;
                break;
        }
        System.out.println(num);
    }
}