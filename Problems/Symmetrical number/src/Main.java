import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        int a = num / 100;
        int b = (num % 10) * 10 + (num / 10) % 10;

        if (a == b) {
            System.out.println(1);
        } else {
            System.out.println(42);
        }
    }
}