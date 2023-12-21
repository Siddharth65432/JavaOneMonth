import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Railway reservation");

        int[] trainNumbers = { 12112, 12423, 12753,12345};
        String[] startingPoints = { "Egmore", "Central","Tambaram","Bhopal" };
        String[] destinations = { "Delhi", "Howrah", "HazratNizamuddin","Nagaland" };

        System.out.println("Available Trains:");
        for (int i = 0; i < trainNumbers.length; i++) {
            System.out.println(trainNumbers[i] + ": From " + startingPoints[i] + " to " + destinations[i]);
        }

        System.out.println("Please select a train by entering its number:");
        int selectedTrainNumber = sc.nextInt();
        sc.nextLine();

        int index = -1;

        for (int i = 0; i < trainNumbers.length; i++) {
            if (trainNumbers[i] == selectedTrainNumber) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Enter the number of tickets needed:");
            int tickets = sc.nextInt();
            sc.nextLine();

            int charge = 250;
            int amount = tickets * charge;
            System.out.println("Enter the age:");
            int age = sc.nextInt();
            sc.nextLine();

            if (age < 18) {
                System.out.println("You have to pay only the half charges: " + (amount / 2));
            } else {
                System.out.println("You have to pay the full price: " + amount);
            }

            System.out.println("Do you need food service in the train during your journey? (yes/no)");
            String needFood = sc.nextLine();

            if (needFood.equalsIgnoreCase("yes")) {
                System.out.println("Enter the food you need:");
                String food = sc.nextLine();
                int costPerFood = 35;
                int foodCost = tickets * costPerFood;
                System.out.println("Total food cost: " + foodCost);
                int total = amount+foodCost;
                System.out.println ("Total price of all taxes is "+ total );
                System.out.println ("Thank you for using our services");
                System.out.println ("Visit again");
            } else {
                System.out.println("No food required. Have a pleasant journey!");
            }
        } else {
            System.out.println("Invalid train number. Please select a valid train.");
        }
    }
}
