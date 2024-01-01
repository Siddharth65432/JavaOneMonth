 import java.util.Scanner;
    public class ReverseTheNumbers{


        public static void main(String[] args) {
            ReverseTheNumbers myObj = new ReverseTheNumbers ();
            myObj.printReversePattern ();
        }

        public int getInput(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int input = sc.nextInt();
            return input;
        }


        public void printReversePattern() {
            int numInput = getInput();
            for (int i = numInput; i > 0; i--) {

                for (int j = numInput - i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }



