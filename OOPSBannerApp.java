/**
 * OOPS Banner App - Use Case 1
 * This program prints the literal text "OOPS" to the console.
 import java.util.Scanner; // Required for user input

/**
 * OOPS Banner App - Use Case 4
 * Refactored to include user interaction and personalized messages.
 * * @author Harikrishanan
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String userName = input.nextLine(); // Reads the name typed by the user

        // Display personalized greeting
        System.out.println("\nHello " + userName + "! Welcome to the OOPS Banner App.");
        
        // Call the modular method from UC3
        printBanner();
        
        input.close(); // Professional practice to close the scanner
    }

    public static void printBanner() {
        System.out.println("  **** **** ***** **** ");
        System.out.println(" * * * * * * * ");
        System.out.println(" * * * * * * * ");
        System.out.println(" * * * * ***** **** ");
        System.out.println(" * * * * * *");
        System.out.println(" * * * * * *");
        System.out.println("  **** **** * **** ");
    }
}