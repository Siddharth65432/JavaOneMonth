 import java.util.Scanner;

    public class Walter2 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the two values");
            System.out.println("Enter a");
            int a = scan.nextInt();
            System.out.println("Enter b");
            int b = scan.nextInt();
            int value;
            System.out.println("Enter the operation number");
            value = scan.nextInt();
            switch (value) {
                case 1:
                    System.out.println("Addition" +(a+b));
                    break;
                case 2:
                    System.out.println("Subtraction" +(a-b));
                    break;
                case 3:
                    System.out.println("Multiplication" +(a*b));
                    break;
                case 4:
                    System.out.println("Division" +(a/b));
                    break;
                default:
                    System.out.println("invalid operation");
                    break;
            }

        }
    }



