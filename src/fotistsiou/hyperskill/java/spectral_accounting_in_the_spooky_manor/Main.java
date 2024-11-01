package fotistsiou.hyperskill.java.spectral_accounting_in_the_spooky_manor;

import java.util.Scanner;

/**
 * Spectral accounting in the spooky manor
 * ---------------------------------------
 * Design a HauntedHouse class with a private ghost count and public methods to add ghosts and get the total count.
 * The class should take an initial ghost count through its constructor and
 * return the updated count after adding new ghosts using respective methods.
 * ---------------------------------------
 * It is necessary to use the following Main:
 * public class Main {
 *     public static void main(String[] args) {
 *         Scanner scanner = new Scanner(System.in);
 *         int initialGhosts = scanner.nextInt();
 *         int newGhosts = scanner.nextInt();
 *
 *         HauntedHouse house = new HauntedHouse(initialGhosts);
 *         house.addGhosts(newGhosts);
 *         System.out.println(house.getGhostCount());
 *     }
 * }
 */

class HauntedHouse {
    private int initialGhosts;

    public HauntedHouse(int initialGhosts) {
        this.initialGhosts = initialGhosts;
    }

    public void addGhosts(int newGhosts) {
        this.initialGhosts += newGhosts;
    }

    public int getGhostCount() {
        return this.initialGhosts;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialGhosts = scanner.nextInt();
        int newGhosts = scanner.nextInt();

        HauntedHouse house = new HauntedHouse(initialGhosts);
        house.addGhosts(newGhosts);
        System.out.println(house.getGhostCount());
    }
}
