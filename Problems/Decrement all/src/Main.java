import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.format("%d %d %d %d", --a, --b, --c, --d);

        int z = 'z';
        char mystery = (char) (z - 10);
        System.out.println(mystery);
    }
}