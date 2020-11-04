import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        int n = 1;
        long factN = 1;
        while (factN <= num) {
            n++;
            factN *= n;
        }
        System.out.println(n);
    }
}