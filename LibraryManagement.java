import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        Map<Character, String> availableBooks = new HashMap<>();
        availableBooks.put('A', "Animal Farm ");
        availableBooks.put('B', "Brave New World ");
        availableBooks.put('C', "Crime and Punishment ");
        availableBooks.put('D', "The Da Vinci Code ");
        availableBooks.put('E', "Ender's Game");
        availableBooks.put('F', "Frankenstein ");
        availableBooks.put('G', "The Great Gatsby ");
        availableBooks.put('H', "The Hobbit");
        availableBooks.put('I', "I, Robot ");
        availableBooks.put('J', "Jane Eyre ");
        availableBooks.put('K', "The Kite Runner");
        availableBooks.put('L', "The Lord of the Rings ");
        availableBooks.put('M', "Moby-Dick");
        availableBooks.put('N', "1984 ");
        availableBooks.put('O', "Of Mice and Men");
        availableBooks.put('P', "Pride and Prejudice ");
        availableBooks.put('Q', "The Queen's Gambit ");
        availableBooks.put('R', "The Road");
        availableBooks.put('S', "Slaughterhouse-Five ");
        availableBooks.put('T', "To Kill a Mockingbird ");
        availableBooks.put('U', "The Underground Railroad ");
        availableBooks.put('V', "The Voyage of the Dawn Treader ");
        availableBooks.put('W', "Weathering Heights ");
        availableBooks.put('X', "Genocide");
        availableBooks.put('Y', "Year of Wonders ");
        availableBooks.put('Z', "Zen and the Art of Motorcycle Maintenance");

        System.out.println("Available Books:");
        displayAvailableBooks(availableBooks);
        System.out.println("Enter the book you are searching for, " + name + ":");
        String book = sc.nextLine();

        if (availableBooks.containsValue(book)) {
            System.out.println("The book '" + book + "' is available.");
            System.out.println("Do you need this book?");
            String option = sc.nextLine();
            System.out.println("It has been taken by " + name + ".");

        } else {
            System.out.println("The book '" + book + "' is occupied.");
        }
    }

    private static void displayAvailableBooks(Map<Character, String> availableBooks) {
        for (Map.Entry<Character, String> entry : availableBooks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void displayAvailableBooksInOrder(Map<String, String> availableBooks, boolean ascendingOrder) {
        if (ascendingOrder) {
            for (char c = 'A'; c <= 'Z'; c++) {
                String key = Character.toString(c);
                if (availableBooks.containsKey(key)) {
                    System.out.println(key + ": " + availableBooks.get(key));
                }
            }
        } else {
            for (char c = 'Z'; c >= 'A'; c--) {
                String key = Character.toString(c);
                if (availableBooks.containsKey(key)) {
                    System.out.println(key + ": " + availableBooks.get(key));
                }
            }
        }
    }
}