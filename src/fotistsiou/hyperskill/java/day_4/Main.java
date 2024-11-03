package fotistsiou.hyperskill.java.day_4;

import java.util.Scanner;

/**
 * Phantom phonics and spectral syllables
 * --------------------------------------
 * Create a Halloween-themed ghost counter that counts the number of 'boo's in a given string.
 * The program should take a string as input and output the count of 'boo's (case-insensitive).
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        int count = countBoos(input);
        System.out.println(count);
    }

    public static int countBoos(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        int count = 0;
        String wordToCount = "boo";
        str = str.toLowerCase();
        String[] words = str.split("\\W+");

        for (String word : words) {
            if (word.contains(wordToCount)) {
                count++;
            }
        }

        return count;
    }
}
