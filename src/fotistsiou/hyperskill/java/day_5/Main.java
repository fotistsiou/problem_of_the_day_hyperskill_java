package fotistsiou.hyperskill.java.day_5;

import java.util.Scanner;

/**
 * Fangs and phantoms in code's shadows
 * ------------------------------------
 * Create a Halloween-themed program that uses a GhostlyEntity class and a Vampire subclass.
 * Fill in the blanks to create a functional program that prints out a spooky message.
 * Fill in the gaps with the relevant elements:
 * _____ GhostlyEntity {
 *     _____ String name;
 *     GhostlyEntity(String name) { this.name = name; }
 *     String haunt() { return name + " haunts!"; }
 * }
 * class Vampire _____ GhostlyEntity {
 *     Vampire(String name) { _____(name); }
 *     String suckBlood() { return name + " sucks blood!"; }
 * }
 * GhostlyEntity spookyCreature = _____ Vampire("Dracula");
 * System.out.println(spookyCreature.haunt());
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the relevant elements about 1st blank:");
            String blank1 = scanner.nextLine();
            System.out.println("Enter the relevant elements about 2nd blank:");
            String blank2 = scanner.nextLine();
            System.out.println("Enter the relevant elements about 3rd blank:");
            String blank3 = scanner.nextLine();
            System.out.println("Enter the relevant elements about 4th blank:");
            String blank4 = scanner.nextLine();
            System.out.println("Enter the relevant elements about 5th blank:");
            String blank5 = scanner.nextLine();

            int score = 0;

            if (blank1.equals("class")) {
                score++;
            }
            if (blank2.equals("protected")) {
                score++;
            }
            if (blank3.equals("extends")) {
                score++;
            }
            if (blank4.equals("super")) {
                score++;
            }
            if (blank5.equals("new")) {
                score++;
            }

            System.out.println("Your score is: " + score + "/5.");

            if (score == 5) {
                System.out.println("Congratulations!");
                break;
            } else {
                System.out.println("Try again.");
            }
        }

        scanner.close();
    }
}

