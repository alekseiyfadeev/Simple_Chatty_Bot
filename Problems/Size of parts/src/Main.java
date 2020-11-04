import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        int countLarger = 0;
        int countSmaller = 0;
        int countPerfect = 0;

        for (int i = 0; i < count; i++) {
            int scanerOutput = scanner.nextInt();
            if (scanerOutput == -1) {
                countSmaller++;
            } else if (scanerOutput == 0) {
                countPerfect++;
            } else if (scanerOutput == 1) {
                countLarger++;
            }
        }

        System.out.format("%d %d %d", countPerfect, countLarger, countSmaller);
    }
}