package fotistsiou.hyperskill.java.day_3;

import java.util.Scanner;

/**
 * Ghostly access in the mansion of code
 * ---------------------------------------
 * You are an indie java game developer looking to capitalize on the upcoming Halloween hype.
 * For your game, you're designing a HauntedMansion class with various room types.
 * Which combination of access modifiers would be most appropriate for the following elements?
 * 1. The HauntedMansion class itself
 * 2. A GhostRoom inner class used only within HauntedMansion
 * 3. A method to add new rooms, used by other classes
 * 4. A list storing all rooms, accessed only within HauntedMansion
 * Select one option from the list:
 * a. public, private, public, private
 * b. public, protected, public, package-private
 * c. public, private, private, protected
 * d. package-private, private, public, private
 * e. package-private, public, public, private
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are an indie java game developer looking to capitalize on the upcoming Halloween hype.");
        System.out.println("For your game, you're designing a HauntedMansion class with various room types.");
        System.out.println("Which combination of access modifiers would be most appropriate for the following elements?");
        System.out.println("- The HauntedMansion class itself");
        System.out.println("- A GhostRoom inner class used only within HauntedMansion");
        System.out.println("- A method to add new rooms, used by other classes");
        System.out.println("- A list storing all rooms, accessed only within HauntedMansion");
        System.out.println("Select one option from the list:");
        System.out.println("a. public, private, public, private");
        System.out.println("b. public, protected, public, package-private");
        System.out.println("c. public, private, private, protected");
        System.out.println("d. package-private, private, public, private");
        System.out.println("e. package-private, public, public, private");

        while (true) {
            System.out.println("Enter a character from 'a' to 'e':");
            String input = scanner.next();
            char answer = input.charAt(0);

            if (answer == 'a') {
                System.out.println("Correct! Are you ready to become an indie java game developer!");
                break;
            } else if (answer >= 'b' && answer <= 'e') {
                System.out.println("Wrong answer. Try again!");
            } else {
                System.out.println("Invalid input. Please enter a character from 'a' to 'e'.");
            }
        }

        scanner.close();
    }
}
