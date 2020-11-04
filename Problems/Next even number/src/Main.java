import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int nextEven = (n / 2 + 1) * 2;

        System.out.println(nextEven);
    }
}