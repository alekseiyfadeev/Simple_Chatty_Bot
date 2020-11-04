import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean isOnlyAPositive = a > 0 && b <= 0 && c <= 0;
        boolean isOnlyBPositive = a <= 0 && b > 0 && c <= 0;
        boolean isOnlyCPositive = a <= 0 && b <= 0 && c > 0;

        boolean res = isOnlyAPositive || isOnlyBPositive || isOnlyCPositive;

        System.out.println(res);
    }
}