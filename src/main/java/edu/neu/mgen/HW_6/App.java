package edu.neu.mgen.HW_6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Part 1: Math class methods
        int x = 10;
        int y = 25;

        System.out.println("Maximum: " + Math.max(x, y));
        System.out.println("Minimum: " + Math.min(x, y));
        System.out.println("Square root of x: " + Math.sqrt(x));
        System.out.println("Square root of y: " + Math.sqrt(y));

        // Part 2: Word and reaction time
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter any word:");

        long startTime = System.currentTimeMillis();
        String word = scanner.nextLine();
        long endTime = System.currentTimeMillis();

        if (word.isEmpty()) {
            System.out.println("You entered an empty line. Please reenter");
            scanner.close();
            return;
        }

        int length = word.length();
        double reactionTime = (endTime - startTime) / 1000.0;

        String classification;

        if (length <= 5) {
            classification = "short";
        } else if (length <= 10) {
            classification = "medium";
        } else {
            classification = "long";
        }

        System.out.println("Your word is " + word);
        System.out.println("It is a " + classification + " word");
        System.out.println("The length of the word is " + length);
        System.out.println("Your reaction time is " + reactionTime + " seconds");

        scanner.close();
    }
}