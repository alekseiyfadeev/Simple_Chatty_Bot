import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isOrdered = true;
        int current = scanner.nextInt();
        int previous;
        int currentDiff;
        int previousDiff = 0;
        while (true) {
            previous = current;
            current = scanner.nextInt();
            if (current == 0) {
                break;
            }
            currentDiff = current - previous;
            if (previousDiff * currentDiff < 0) {
                isOrdered = false;
                break;
            } else if (currentDiff != 0) {
                previousDiff = currentDiff;
            }
        }
        System.out.println(isOrdered);
    }
}