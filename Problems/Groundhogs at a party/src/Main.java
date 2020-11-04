import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean goodForWeekend = 15 <= num && num <= 25;
        boolean goodForUsalDay = 10 <= num && num <= 20;

        boolean res = goodForWeekend && isWeekend || goodForUsalDay && !isWeekend;

        System.out.println(res);
    }
}