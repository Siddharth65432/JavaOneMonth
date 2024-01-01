import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bus {
    public static List<Passenger> passengers = new ArrayList();
    private static Scanner scanner;

    Bus() {
    }

    public static void main(String[] args) {
        boolean running = true;
        System.out.println("Welcome to the Bus Management System");

        for(; running; System.out.println()) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    enterDetails();
                    break;
                case 2:
                    viewSeats();
                    break;
                case 3:
                    seatsAvailable();
                    break;
                case 4:
                    makeReservation();
                    break;
                case 5:
                    running = false;
                    System.out.println("Thank you for using our service!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

    }

    private static void displayMenu() {
        System.out.println("1. Enter passenger details");
        System.out.println("2. View booked seats");
        System.out.println("3. Check available seats");
        System.out.println("4. Make a reservation");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static String enterDetails() {
        System.out.println("Enter passenger details");
        System.out.print("Enter passenger name: ");
        String name = scanner.nextLine();
        System.out.print("Enter passenger age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        Passenger passenger = new Passenger(name, age);
        passengers.add(passenger);
        System.out.println("Passenger details recorded successfully.");
        return name;
    }

    private static void viewSeats() {
        System.out.println("Booked Seats:");

        for(int i = 0; i < passengers.size(); ++i) {
            System.out.println("Seat " + (i + 1) + ": " + ((Passenger)passengers.get(i)).getName());
        }

    }

    private static void seatsAvailable() {
        int availableSeats = getTotalSeats() - passengers.size();
        System.out.println("Available Seats: " + availableSeats);
    }

    private static int getTotalSeats() {
        return 50;
    }

    private static void makeReservation() {
        int availableSeats = getTotalSeats() - passengers.size();
        if (availableSeats > 0) {
            System.out.println("Reservation successful!");
        } else {
            System.out.println("Sorry, no seats available.");
        }

    }

    static {
        scanner = new Scanner(System.in);
    }

    private static class Passenger {
        public Passenger ( String name, int age ) {
        }

        public <name> String getName () {
            String name = enterDetails ();
            return name;
        }
    }
}
