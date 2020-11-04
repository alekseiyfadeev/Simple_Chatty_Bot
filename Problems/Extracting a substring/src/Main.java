import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int startPos = scanner.nextInt();
        int endPos = scanner.nextInt();

        String result = string.substring(startPos, endPos + 1);

        System.out.println(result);
    }
}