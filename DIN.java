import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.interfaces.DSAPublicKey;
import java.util.ArrayList;
import java.util.Scanner;

public class DIN {
    public static void main ( String[] args ) {
////        String[][]Bikes ={
////                {"Bajaj","Suzuki","Honda"},
////                {"Hero","Royal Enfield","Ninja"},
////                {"Harley Davidson","Yamaha","Apache"}
////        };
////
////        for(int i=0;i<Bikes.length;i++){
////            System.out.println();
////            for (int j=0;j<Bikes[i].length;j++){
////                System.out.println(Bikes[i][j]+ " ");
////            }
////        String name = "Siddharth";
////        boolean result = name.equalsIgnoreCase("Siddharth");
////         int result = name.length();
////        char result = name.charAt(0);
////        int result = name.indexOf("i");
////        boolean result = name.isEmpty();
////        String result = name.toUpperCase();
////        String result = name.toLowerCase();
////        String result = name.trim();
////        String result = name.replace("d","o");
////        System.out.println(result);
////        ArrayList<String>dishes = new ArrayList<String>();
////
////        dishes.add("dosa");
////        dishes.add("poori");
////        dishes.add("egg omlet");
////        dishes.add("Chapati");
////
////        dishes.set(2,"idly");
////        dishes.remove(1);
//////        dishes.clear();
////
////        for (int i=0;i<dishes.size();i++){
////            System.out.println(dishes.get(i));
////        }
////           ArrayList<String> bakeryList = new ArrayList<>();
////           bakeryList.add("pasta");
////           bakeryList.add("pizza");
////           bakeryList.add("donuts");
////        System.out.println(bakeryList.get(0));
////            ArrayList<String> produceList = new ArrayList<>();
////            produceList.add("tomatoes");
////            produceList.add("grains");
////            produceList.add("pulses");
////        System.out.println(produceList.get(0));
////            ArrayList<String> drinksList = new ArrayList<>();
////            drinksList.add("soda");
////            drinksList.add("coffee");
////        System.out.println(drinksList.get(0));
////        double x = add(1,2,3,4);
////
////        System.out.println(x);
////        }
////        static int add(int a , int b){
////            System.out.println("This is overload");
////            return a+b;
////        }
////        static int add(int a , int b,int c){
////            System.out.println("#2");
////            return a+b+c;
////        }
////        static int add(int a , int b,int c,int d) {
////        System.out.println("#3");
////        return a+b+c+d;
////    }
////        System.out.printf("This is a format string %d",123);
//          boolean myBoolean = true;
//          char myChar ='@';
//          String myString ="Siddharth";
//          int myInt =50;
//          double myDouble =1000;
//
//        System.out.printf("%b",myBoolean);
//        System.out.printf("%c",myChar);
//        System.out.printf("%s",myString);
//        System.out.printf("%d",myInt);
////        System.out.printf("%f",myDouble);
//        final double pi = 3.14159;
//        System.out.println(pi);
//        Car myCar1 = new Car();
//        Car myCar2 = new Car();
//
//        System.out.println(myCar1.make);
//        System.out.println(myCar2.model);
//        System.out.println();
//        System.out.println(myCar2.make);
//        System.out.println(myCar2.model);
//    }
//}
// class Car{
//    String make ="Tesla";
//    String model ="Y3";
//    int year=2021;
//    String color ="white";
//    double price = 100000.00;
//    void drive(){
//        System.out.println("You drove the car well!!");
//    }
//    void stop(){
//        System.out.println("You have stopped the car on for a call!");
//    }
//                Human human1 = new Human("Ricky",12,30);
//                Human human2 = new Human("Micheal",22,75);
//                System.out.println(human1.name);
//                System.out.println(human1.age);
//                System.out.println(human1.weight);
//        System.out.println(human2.name);
//        System.out.println(human2.age);
//        System.out.println(human2.weight);
//            }
//        }
//        class Human{
//            String name;
//            int age;
//            double weight;
//            Human(String name,int age,double weight){
//                this.name = name;
//                this.age = age;
//                this.weight=weight;
//        Friend friend1 = new Friend("Siddharth");
//        Friend friend2 = new Friend("Siva");
//        Friend friend3 = new Friend("Hemavathi");
//        Friend.displayFriends();
//            }
//            static class Friend{
//        String name;
//         static int numberOfFriends;
//        Friend(String name){
//            this.name=name;
//            numberOfFriends++;
//        }
//        static void displayFriends(){
//            System.out.println("Your have "+numberOfFriends);
//        }
//         class Main {
//            class Garage {
//
//                public void park ( Car car ) {
//                    System.out.println ( String.format ( "The"+car.name+"is parked in the garage." ) );
//                }
//            }
//
//            class Car {
//                String name;
//
//                Car ( String name ) {
//                    this.name = name;
//                }
//            }
//
//            public class D {
//                public void main ( String[] args ) {
//                    Garage garage = new Garage ( );
//                    Car car1 = new Car ( "LAMBO" );
//                    Car car2 = new Car ( "Tesla" );
//
//                    garage.park ( car1 );
//                    garage.park ( car2 );
//                }
//            }
//        try {
//            FileWriter writer = new FileWriter ( "name.txt" );
//            writer.write("Siddharth is a Zoho Student ZSTCH1354");
//            writer.close ();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
//    }
         class ReplaceZeroWithFive {
            public static int replaceZeroWithFive(int number) {
                int result = 0;
                int product = 1;

                while (number > 0) {
                    int digit = number % 10;
                    if (digit == 2) {
                        digit = 5;
                    }
                    result += digit * product;
                    product *= 10;
                    number /= 10;
                }

                return result;
            }

            public static void main(String[] args) {
                int value = 22222;
                int modifiedValue = replaceZeroWithFive(value);
                System.out.println("Original value: " + value);
                System.out.println("Modified value: " + modifiedValue);
            }
        }

    }

    }


