import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean isInputCorrect = n > 0 && m > 0 && k > 0;

        if (isInputCorrect && (k % n == 0 || k % m == 0) && k < m * n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}