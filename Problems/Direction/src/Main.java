import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(getDirection(in.nextInt()));
    }

    private static String getDirection(int num) {
        switch (num) {
            case 1:
                return "move up";
            case 2:
                return "move down";
            case 3:
                return "move left";
            case 4:
                return "move right";
            case 0:
                return "do not move";
            default:
                return "error!";
        }
    }
}