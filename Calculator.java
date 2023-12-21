import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A");
        int a = scan.nextInt();
        System.out.println("Enter B");
        int b = scan.nextInt();
        System.out.println("Enter C");
        int c = scan.nextInt();
        System.out.println("Enter D");
        int d = scan.nextInt();


        int result = add(a, b ,c ,d);
        System.out.println("The result is " + result);
    }

    public static int add(int num1, int num2,int num3,int num4) {
        return num1 + num2 +num3+num4;
    }
}
