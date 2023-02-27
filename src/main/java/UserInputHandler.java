import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class UserInputHandler {
    private static final long minCardNumber = 1000000000000000L;
    private static final long maxCardNumber = 10000000000000000L;

    protected static long getCardNumber() {
        System.out.println("Enter your card number: ");
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                long cardNumber = s.nextLong();
                if (cardNumber > minCardNumber && cardNumber < maxCardNumber) {
                    return cardNumber;
                } else {
                    System.out.println("Invalid input. Please enter correct 16 card numbers.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Incorrect number type. Please enter correct 16 card numbers.");
            }
        }
    }

    private static String getText(String pattern) {
        while (true) {
            try {
                Scanner s = new Scanner(System.in);
                if (s.hasNext(pattern)) {
                    return s.next();
                } else {
                    System.out.println("Invalid input. Please enter correct text format.");
                }
            } catch (NoSuchElementException e) {
                System.out.println("Text value is required. Please try again.");
            }
        }
    }

    protected static String getName() {
        System.out.println("Enter your name: ");
        return getText("[A-ZĄ-Ż]+[a-zą-ż]*");
    }

    protected static String getEmail() {
        System.out.println("Enter your e-mail: ");
        return getText("[a-z0-9.]+@[a-z]+[.]+[a-z]*");
    }

    protected static String getLogin() {
        System.out.println("Enter your login: ");
        return getText("[a-z]+[0-9]*");
    }

    protected static String getPassword() {
        System.out.println("Enter your password: ");
        return getText("[A-ZĄ-Źa-zą-ż0-9@!#$%^&*()-_+=/<>,?.]*");
    }
}
