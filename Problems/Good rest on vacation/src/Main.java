import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int duration = scanner.nextInt();
        int costFoodPerDay = scanner.nextInt();
        int costOneWayFlight = scanner.nextInt();
        int costHotelOneNight = scanner.nextInt();

        int totalCost = 2 * costOneWayFlight + duration * costFoodPerDay + (duration - 1) * costHotelOneNight;

        System.out.println(totalCost);
    }
}