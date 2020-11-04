import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        boolean res = first <= num && num <= second || second <= num && num <= first;

        System.out.println(res);
    }
}