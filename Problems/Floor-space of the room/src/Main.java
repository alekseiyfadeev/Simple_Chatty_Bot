import java.util.Scanner;

class Main {
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {
        switch (stdin.next()) {
            case "triangle":
                computeTriangle();
                break;
            case "rectangle":
                computeRectangle();
                break;
            case "circle":
                computeCircle();
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    private static void computeCircle() {
        double r = stdin.nextDouble();
        System.out.println(3.14 * r * r);
    }

    private static void computeRectangle() {
        double a = stdin.nextDouble();
        double b = stdin.nextDouble();
        System.out.println(a * b);
    }

    private static void computeTriangle() {
        double a = stdin.nextDouble();
        double b = stdin.nextDouble();
        double c = stdin.nextDouble();
        double p = (a + b + c) / 2;
        if (p - a <= 0 || p - b <= 0 || p - c <= 0) {
            System.out.println("Error");
            return;
        }
        System.out.println(Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}