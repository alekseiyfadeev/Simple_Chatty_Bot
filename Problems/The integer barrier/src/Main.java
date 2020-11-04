import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num = scanner.nextInt();
        while (num != 0) {
            sum += num;
            if (sum >= 1000) {
                sum -= 1000;
                break;
            }
            num = scanner.nextInt();
        }
        System.out.println(sum);
    }
}