package utils;

import java.util.Scanner;

/**
 * Utility class for handling user input validation
 */
public class InputValidator {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Gets validated string input from the user
     */
    public static String getStringInput(String message) {
        String input;
        do {
            System.out.print(message);
            input = scanner.nextLine().trim();
            if (input.isEmpty()) System.out.println("Input cannot be empty. Please try again.");
        } while (input.isEmpty());
        return input;
    }

    /**
     * Gets a validated boolean input (true/false)
     */
    public static boolean getBooleanInput(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim().toLowerCase();
            if (input.equals("true")) return true;
            if (input.equals("false")) return false;
            System.out.println("Invalid input. Please enter 'true' or 'false'.");
        }
    }

    /**
     * Gets a validated integer input
     */
    public static int getIntegerInput(String message) {
        while (true) {
            System.out.print(message);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }
}
