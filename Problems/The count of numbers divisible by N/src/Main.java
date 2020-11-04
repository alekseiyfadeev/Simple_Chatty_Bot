import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        /* With loop */
//        int count = 0;
//
//        for (int i = a; i <= b; i++) {
//            if (i % n == 0) {
//                count++;
//            }
//        }

        /* Without loop */
        int count = b / n - (a - 1) / n;

        System.out.println(count);
    }
}