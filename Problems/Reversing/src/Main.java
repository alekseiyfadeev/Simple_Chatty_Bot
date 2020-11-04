import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int d1 = n / 100;
        int d2 = n / 10 % 10;
        int d3 = n % 10;

        int res = d3 * 100 + d2 * 10 + d1;

        System.out.println(res);
    }
}