import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            System.out.println("Enter the mark obtained");
            int mark = sc.nextInt();
            if (mark < 100 && mark > 90) {
                System.out.println("You got A");
            }
            if (mark < 90 && mark > 80) {
                System.out.println("You are near A !Keep trying even more");
            }
            if (mark < 80 && mark > 70) {
                System.out.println("You got below A");
            }
            if (mark < 70 && mark > 60) {
                System.out.println("You got Average");
            }
            if (mark < 60 && mark > 50) {
                System.out.println("You are below average");
            }
            if (mark < 50 && mark > 40) {
                System.out.println("You got some nerve!!");
            }
            if (mark<40 && mark>30){
                System.out.println("You better start preparation");
            }
            if (mark < 30 && mark > 20) {
                System.out.println("You aren't up to the mark");
            }
            if (mark<20 && mark>10){
                System.out.println("You better start studying more focused");
            }
            if(mark<10 && mark>0){
                System.out.println("You have nothing left!!Try even damn harder");
            }
        }
    }
}
