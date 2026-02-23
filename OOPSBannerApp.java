/**
 * OOPS Banner App - Use Case 1
 * This program prints the literal text "OOPS" to the console.
 /**
 * OOPS Banner App - Use Case 3
 * Refactored to use modular methods for better code organization.
 * * @author Harikrishanan
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {
        // Now we just "call" the method instead of writing all 7 lines here
        printOopsBanner(); 
    }

    /**
     * This method contains the logic to print the 7-line ASCII banner.
     * Breaking code into methods like this is called "Modularization".
     */
    public static void printOopsBanner() {
        System.out.println("  **** **** ***** **** ");
        System.out.println(" * * * * * * * ");
        System.out.println(" * * * * * * * ");
        System.out.println(" * * * * ***** **** ");
        System.out.println(" * * * * * *");
        System.out.println(" * * * * * *");
        System.out.println("  **** **** * **** ");
    }
}