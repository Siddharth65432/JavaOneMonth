import java.util.Scanner;

    public class RoundingDecimal {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number to be rounded up");
            double number = sc.nextDouble();

            double roundedToOne = roundToPlace(number, 1);
            double roundedToTen = roundToPlace(number, 10);
            double roundedToHundred = roundToPlace(number, 100);
            double roundedToThousand = roundToPlace(number, 1000);

            System.out.println("Original number: " + number);
            System.out.println("Rounded to the nearest ones: " + roundedToOne);
            System.out.println("Rounded to the nearest ten: " + roundedToTen);
            System.out.println("Rounded to the nearest hundred: " + roundedToHundred);
            System.out.println("Rounded to the nearest thousand: " + roundedToThousand);

            if (number % 1 >= 0.5) {
                System.out.println("The number is rounded up.");
            } else {
                System.out.println("The number is rounded down.");
            }
        }

        public static double roundToPlace(double number, int place) {
            return Math.round(number / place) * place;
        }
    }

