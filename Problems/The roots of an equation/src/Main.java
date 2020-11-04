import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int rootsFound = 0;

        for (int i = 0; i < 1000 && rootsFound < 3; i++) {
            if (a * i * i * i + b * i * i + c * i + d == 0) {
                rootsFound++;
                System.out.println(i);
            }
        }
    }
}