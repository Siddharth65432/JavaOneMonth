// import java.util.Scanner;
//
//
//    public class EvenorOdd {
//        Scanner inpObj = new Scanner(System.in);
//        public static void main(String[] args) {
//            OddEven myObj = new OddEven();
//            // myObj.getInput();
//            // myObj.StoreArray();
//            myObj.segregateEvenOdd();
//        }
//
//        public int getInput(){
//            System.out.println("Enter the number of entries to be given: ");
//            int numbEntries = inpObj.nextInt();
//
//            return numbEntries;
//
//        }
//
//        public int[] StoreArray(){
//            int numbEntries = getInput();
//            int []rawArray = new int[numbEntries];
//
//
//            for(int i = 0; i < numbEntries; i++){
//                System.out.println("Enter number " + (i+1) + ": ");
//                int num = inpObj.nextInt();
//
//                rawArray[i] = num;
//
//                // i++;
//
//
//            }
//
//            // for (int num : rawArray) {
//            //     System.out.print(num + " ");
//            // }
//            // System.out.println();
//
//            // System.out.println(arrayExample.processArray(resultArray););
//
//
//            return rawArray;
//
//        }
//
//        public void segregateEvenOdd(){
//            int []rawArray = StoreArray();
//            int countEven = 0;
//            int countOdd = 0;
//            // int evenArray;
//            for (int i = 0; i<rawArray.length;i++){
//                int x = rawArray[i];
//                if (x%2 == 0) {
//                    countEven++;
//                    // for (int j = 0; j<countEven;j++){
//                    // evenArray[j] = x;
//                    // }
//                    // int []evenArray = int [];
//                    // evenArray = int[j]
//                    // System.out.println("even");
//
//                }
//
//                else{
//                    countOdd++;
//                }
//
//
//            }
//
//
//            int []evenArray = new int[countEven];
//            int []oddArray = new int[countOdd];
//            int oddIdx = 0;
//            int evenIdx = 0;
//
//            for (int i = 0; i<rawArray.length;i++){
//                int x = rawArray[i];
//
//                if (x % 2 == 0) {
//                    evenArray[evenIdx++] = x;
//                }
//
//                else {
//                    oddArray[oddIdx++] = x;
//                }
//            }
//            System.out.println();
//            System.out.println();
//
//            System.out.print("The even number you have enters are: ");
//            for (int num : evenArray){
//                System.out.print(num + ", ");
//            }
//            System.out.println();
//
//            System.out.print("The odd number you have enters are: ");
//            for (int num : oddArray){
//                System.out.print(num + ", ");
//            }
//            System.out.println();
//// for (int num : evenArray) {
//            // System.out.print(num + " ");
//
//
//            // return
//        }
//        //  System.out.println();
//
//        // System.out.println(evenArray);
//        // int []evenArray = new int[countEven];
//
//    }
//
//
//
//}
