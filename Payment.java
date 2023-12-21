import java.util.Scanner;

public class Payment {
    protected double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public void makePayment() {

    }
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    private String cvv;

    public CreditCardPayment(double amount, String cardNumber, String cardHolder, String expirationDate, String cvv) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    public void makePayment() {
        System.out.println("Processing credit card payment...");
        System.out.println("Amount: $" + amount);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("Expiration Date: " + expiryDate);
        System.out.println("CVV: " + cvv);
        System.out.println("Payment successful.");
    }
}

class PayPalPayment extends Payment {
    private String email;
    protected String password;

    public PayPalPayment(double amount, String email, String password) {
        super(amount);
        this.email = email;
        this.password = password;
    }

    @Override
    public void makePayment() {
        System.out.println("Processing PayPal payment...");
        System.out.println("Amount: $" + amount);
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
        System.out.println("Payment successful.");
    }
}

class UPI extends Payment {
    private String email;
    protected String pin;

    public UPI(double amount, String email, String pin) {
        super(amount);
        this.email = email;
        this.pin = pin;
    }

    public void makePayment() {
        System.out.println("Processing UPI payment...");
        System.out.println("Amount: $" + amount);
        System.out.println("Email: " + email);
        System.out.println("Pin: " + pin);
        System.out.println("Payment successful.");
    }
}

class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Payment System!");
        System.out.print("Enter the number of items you want to buy: ");
        int numItems = sc.nextInt();
        sc.nextLine();

        double totalAmount = 0.0;
        for (int i = 1; i <= numItems; i++) {
            System.out.println("Enter details for Item " + i + ":");
            System.out.print("Enter the item name: ");
            String itemName = sc.nextLine();
            System.out.print("Enter the item price: $");
            double itemPrice = sc.nextDouble();
            sc.nextLine();
            totalAmount += itemPrice;
            System.out.println("Item " + i + " added to the cart.");
            System.out.println("---------------------------------------");
        }

        System.out.println("Total amount to be paid: $" + totalAmount);

        System.out.println("Select a payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. PayPal");
        System.out.println("3. UPI");
        System.out.print("Enter your choice: ");
        int paymentMethod = sc.nextInt();
        sc.nextLine();

        switch (paymentMethod) {
            case 1:
                System.out.println("Processing payment with Credit Card");
                System.out.print("Enter Card Number: ");
                String cardNumber = sc.nextLine();
                System.out.print("Enter Card Holder Name: ");
                String cardHolder = sc.nextLine();
                System.out.print("Enter Expiration Date: ");
                String expiryDate = sc.nextLine();
                System.out.print("Enter CVV: ");
                String cvv = sc.nextLine();

                Payment creditCardPayment = new CreditCardPayment(totalAmount, cardNumber, cardHolder, expiryDate, cvv);
                creditCardPayment.makePayment();
                break;

            case 2:
                System.out.println("Processing payment with PayPal");
                System.out.print("Enter PayPal Email: ");
                String email = sc.nextLine();
                System.out.print("Enter PayPal Password: ");
                String password = sc.nextLine();

                Payment payPalPayment = new PayPalPayment(totalAmount, email, password);
                payPalPayment.makePayment();
                break;

            case 3:
                System.out.println("Processing payment with UPI");
                System.out.print("Enter UPI Email: ");
                email = sc.nextLine();
                System.out.print("Enter UPI PIN: ");
                String pin = sc.nextLine();

                Payment upiPayment = new UPI(totalAmount, email, pin);
                upiPayment.makePayment();
                break;

            default:
                System.out.println("Invalid payment method selected.");
                break;
        }

        System.out.println("Thank you for using the Payment System!");
    }
}