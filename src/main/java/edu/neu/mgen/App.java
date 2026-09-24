package edu.neu.mgen;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

    
        int number1 = 10;
        int number2 = 20;

        long largeNumber1 = 1000L;
        long largeNumber2 = 2000L;

        double amount1 = 15.50;
        double amount2 = 25.75;

        boolean student = true;
        boolean worker = false;

        char grade1 = 'A';
        char grade2 = 'B';

        long convertedNumber1 = number1;
        long convertedNumber2 = number2;

        int convertedLargeNumber1 = (int) largeNumber1;
        int convertedLargeNumber2 = (int) largeNumber2;

        System.out.println("Int to Long: " + convertedNumber1 + ", " + convertedNumber2);
        System.out.println("Long to Int: " + convertedLargeNumber1 + ", " + convertedLargeNumber2);

        System.out.println("Price 1: " + amount1);
        System.out.println("Price 2: " + amount2);
        System.out.println("Total price: " + (amount1 + amount2));

        System.out.println("Grade 1: " + grade1);
        System.out.println("Grade 2: " + grade2);

        System.out.println("Addition: " + (number1 + number2));
        System.out.println("Subtraction: " + (number2 - number1));
        System.out.println("Multiplication: " + (number1 * number2));
        System.out.println("Division: " + (number2 / number1));

        System.out.println("AND: " + (student && worker));
        System.out.println("OR: " + (student || worker));
        System.out.println("NOT: " + (!worker));

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int userNumber1 = scanner.nextInt();

        System.out.print("Enter your second number: ");
        int userNumber2 = scanner.nextInt();

        System.out.println("Your addition: " + (userNumber1 + userNumber2));
        System.out.println("Your subtraction: " + (userNumber1 - userNumber2));
        System.out.println("Your multiplication: " + (userNumber1 * userNumber2));
        System.out.println("Your division: " + (userNumber1 / userNumber2));

        System.out.println("Are the numbers equal? " + (userNumber1 == userNumber2));
        System.out.println("Is the first number greater? " + (userNumber1 > userNumber2));

        scanner.close();
    }
}