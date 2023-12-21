 import java.util.*;
    public class BooksShop {
        private static Map<Character, String> availableBooks = new HashMap<>();
        private static Map<String, String> borrowedBooks = new HashMap<>();
        private static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            initializeLibrary();

            System.out.println("Welcome to the Library!");
            System.out.println("Enter your name:");
            String name = sc.nextLine();

            while (true) {
                System.out.println("\nMenu:");
                System.out.println("1. Display Available Books");
                System.out.println("2. Borrow a Book");
                System.out.println("3. Return a Book");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                int choice = getValidInput(1, 4);

                switch (choice) {
                    case 1:
                        displayAvailableBooks();
                        break;
                    case 2:
                        borrowBook(name);
                        break;
                    case 3:
                        returnBook(name);
                        break;
                    case 4:
                        System.out.println("Thank you for using the Library!");
                        sc.close();
                        return;
                }
            }
        }

        private static void initializeLibrary() {

        }

        private static void displayAvailableBooks() {
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
            System.out.println("\nAvailable Books:");
            for (Map.Entry<Character, String> entry : availableBooks.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        private static void borrowBook(String name) {
            System.out.println("\nEnter the book you want to borrow:");
            String book = sc.nextLine();
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

            if (availableBooks.containsValue(book)) {
                char bookKey = getKeyByValue(book);
                availableBooks.remove(bookKey);
                borrowedBooks.put(book, name);
                System.out.println("'" + book + "' has been borrowed by " + name);
            } else {
                System.out.println("Sorry, the book '" + book + "' is not available.");
            }
        }

        private static void returnBook(String name) {
            System.out.println("\nEnter the book you want to return:");
            String book = sc.nextLine();
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

            if (borrowedBooks.containsKey(book) && borrowedBooks.get(book).equals(name)) {
                borrowedBooks.remove(book);
                availableBooks.put(getKeyByValue(book), book);
                System.out.println("'" + book + "' has been returned by " + name);
            } else {
                System.out.println("Sorry, you cannot return '" + book + "'.");
            }
        }

        private static char getKeyByValue(String value) {
            for (Map.Entry<Character, String> entry : availableBooks.entrySet()) {
                if (value.equals(entry.getValue())) {
                    return entry.getKey();
                }
            }
            return 0;
        }

        private static int getValidInput(int min, int max) {
            int choice = -1;
            while (true) {
                try {
                    choice = Integer.parseInt(sc.nextLine());
                    if (choice >= min && choice <= max) {
                        break;
                    } else {
                        System.out.print("Please enter a valid choice: ");
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Please enter a valid number: ");
                }
            }
            return choice;
        }
    }


