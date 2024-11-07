package fotistsiou.java.problemOfTheDay.day_7;

import java.util.Scanner;

/**
 * Forecast fiesta in your console
 * -------------------------------
 * Create a Java program that displays a weather forecast for today.
 * -------------------------------
 * Reorder the lines of code to print the temperature, humidity, and wind speed:
 * 1. System.out.println("Temperature: 25°C");
 * 2. ....}
 * 3. System.out.println("Wind Speed: 10 km/h");
 * 4. }
 * 5. System.out.println("Humidity: 60%");
 * 6. public static void main(String[] args) {
 * 7. public class WeatherForecast {
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number of code lines with correct order, separated by spaces in a single line:");
        while (true) {
            if (scanner.nextLine().equals("7 6 1 5 3 2 4")) {
                System.out.println("Correct!");
                scanner.close();
                return;
            }
            System.out.println("Try again:");
        }
    }
}
