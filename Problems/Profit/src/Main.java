import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();

        double amount = m;
        int years = 0;
        while (amount < k) {
            amount *= 1 + p / 100.0;
            years++;
        }
        System.out.println(years);
    }
}