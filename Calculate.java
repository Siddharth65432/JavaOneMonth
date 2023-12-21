//import java.util.Scanner;
//
//public class Calculate {
//    public static void main ( String[] args ) {
//        Scanner scan = new Scanner ( System.in );
//        System.out.println ( "Enter the two numbers" );
//        int a = scan.nextInt ( );
//        int b = scan.nextInt ( );
//
//        Calculate calculator = new Calculate ( );
//        calculator.add ( a, b );
//        calculator.subtraction ( a, b );
//        calculator.multiplication ( a, b );
//        calculator.division ( a, b );
//    }
//
//    public int add ( int a, int b ) {
//        int result = a + b;
//        System.out.println ( "The result is" + result );
//        return 0;
//    }
//
//    public int subtraction ( int a, int b ) {
//        int result = a - b;
//        System.out.println ( "The result is" + result );
//        return 0;
//    }
//
//    public int multiplication ( int a, int b ) {
//        int result = a * b;
//        System.out.println ( "The result is" + result );
//        return 0;
//    }
//
//    public int division ( int a, int b ) {
//        int result = a / b;
//        System.out.println ( "The result is" + result );
//        return 0;
//    }
//}
import java.util.Scanner;
//
public class Calculate {
    public static void main ( String[] args ) {
        Calculate calculate = new Calculate ( );
        int result1 = calculate.addition ( 8, 12 );
        int result2 = calculate.addition ( 5, 8, 7 );
        int result3 = calculate.subtraction ( 9,7 );
        int result4 = calculate.subtraction ( 18,12,1 );
        int result5 = calculate.multiplication(3,7);
        int result6 = calculate.multiplication ( 2,3,4);
        int result7 = calculate.division(24,3);
        int result8 = calculate.division ( 36,2,9);

        System.out.println ( "Result 1: " + result1 );
        System.out.println ( "Result 2: " + result2 );
        System.out.println ("Result3: " + result3);
        System.out.println ("Result4: " + result4);
        System.out.println ("Result5: " + result5);
        System.out.println ("Result6: " + result6);
        System.out.println ("Result7: " + result7);
        System.out.println ("Result8: " + result8);
    }

    public int addition ( int a, int b ) {
        int result = a + b;
//        System.out.println("Result for addition(int a, int b): " + result);
        return result;
    }

    public int addition ( int a, int b, int c ) {
        int result = a + b + c;
//        System.out.println("Result for addition(int a, int b, int c): " + result);
        return result;
    }
    public int subtraction(int a,int b){
        int result = a-b;
        return result;
    }
    public int subtraction(int a,int b,int c){
        int result = a-b-c;
        return result;
    }
    public int multiplication(int a, int b){
        int result = a * b;
//        System.out.println("Result for addition(int a, int b): " + result);
        return result;
    }

    public int multiplication(int a, int b, int c){
        int result = a * b * c;
//        System.out.println("Result for addition(int a, int b, int c): " + result);
        return result;
    }
    public int division(int a, int b){
        int result = a / b;
//        System.out.println("Result for addition(int a, int b): " + result);
        return result;
    }

    public int division(int a, int b, int c){
        int result = a / b / c;
//        System.out.println("Result for addition(int a, int b, int c): " + result);
        return result;
    }
}



//import java.util.Scanner;
//
//public class Calculate {
//    public static void main ( String[] args ) {
//        Scanner scan = new Scanner ( System.in );
//        System.out.println ( "Enter three numbers" );
//        int a = scan.nextInt ();
//        int b = scan.nextInt ();
//        int c = scan. nextInt ();
//
//        Calculate calculator = new Calculate ( );
//        calculator.add ( a, b, c );
//        calculator.subtraction ( a, b ,c );
//        calculator.multiplication ( a, b ,c);
//        calculator.division ( a, b , c );
//    }
//
//    public int add ( int a, int b,int c) {
//        int result = a + b +c;
//        System.out.println ( "The result is" + result );
//        return 0;
//    }
//
//    public int subtraction ( int a, int b,int c ) {
//        int result = a - b - c;
//        System.out.println ( "The result is" + result );
//        return 0;
//    }
//
//    public int multiplication ( int a, int b ,int c ) {
//        int result = a * b *c;
//        System.out.println ( "The result is" + result );
//        return 0;
//    }
//
//    public int division ( int a, int b, int c ) {
//        int result = a / b / c;
//        System.out.println ( "The result is" + result );
//        return 0;
//    }
//}