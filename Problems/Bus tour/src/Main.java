import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int bridgesCount = scanner.nextInt();
        int i;
        for (i = 1; i <= bridgesCount; i++) {
            if (scanner.nextInt() <= busHeight) {
                break;
            }
        }
        if (i <= bridgesCount) {
            System.out.println("Will crash on bridge " + i);
        } else {
            System.out.println("Will not crash");
        }
    }
}