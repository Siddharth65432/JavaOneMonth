import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units recorded:");
        int units = sc.nextInt();

        int cost = 0;
        if (units <= 100) {
            cost = units * 1;
        } else if (units <= 300) {
            cost = 100 + (units - 100) * 2;
        } else if (units <= 500) {
            cost = 100 + 200 + (units - 300) * 3;
        } else {
            cost = 100 + 200 + 300 + (units - 500) * 4;
        }

        System.out.println("The total units recorded: " + units);
        System.out.println("The cost to be paid: " + cost);

        sc.close();
    }
}
