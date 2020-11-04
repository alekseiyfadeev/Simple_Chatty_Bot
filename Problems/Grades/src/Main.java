import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;

        for (int i = 0; i < count; i++) {
            int grade = scanner.nextInt();
            if (grade == 2) {
                countD++;
            } else if (grade == 3) {
                countC++;
            } else if (grade == 4) {
                countB++;
            } else if (grade == 5) {
                countA++;
            }
        }

        System.out.format("%d %d %d %d", countD, countC, countB, countA);
    }
}