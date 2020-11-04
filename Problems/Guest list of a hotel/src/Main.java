import java.util.Scanner;

class Main {
    public static final int NUMBER_OF_PERSONS = 8;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] guests = new String[NUMBER_OF_PERSONS];
        for (int i = 0; i < NUMBER_OF_PERSONS; i++) {
            guests[i] = scanner.next();
        }
        for (int i = NUMBER_OF_PERSONS - 1; i >= 0; i--) {
            System.out.println(guests[i]);
        }
    }
}