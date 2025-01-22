package com.ontariotechu.sofe3980U;

import java.util.Scanner;
import org.joda.time.LocalTime;

/**
 * Hello world!
 *
 */
public class App {
    /**
     * Main program: The entry point of the program. The local time will be printed first,
     * then it will interact with the user to perform binary operations.
     *
     * @param args: not used
     */
    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first binary number: ");
        String input1 = scanner.nextLine();
        Binary binary1 = new Binary(input1);

        System.out.print("Enter the second binary number: ");
        String input2 = scanner.nextLine();
        Binary binary2 = new Binary(input2);

        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Bitwise OR");
        System.out.println("3. Bitwise AND");
        System.out.println("4. Multiplication");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        Binary result = null;
        switch (choice) {
            case 1:
                result = Binary.add(binary1, binary2);
                System.out.println("Result of Addition: " + result.getValue());
                break;
            case 2:
                result = Binary.or(binary1, binary2);
                System.out.println("Result of Bitwise OR: " + result.getValue());
                break;
            case 3:
                result = Binary.and(binary1, binary2);
                System.out.println("Result of Bitwise AND: " + result.getValue());
                break;
            case 4:
                result = Binary.multiply(binary1, binary2);
                System.out.println("Result of Multiplication: " + result.getValue());
                break;
            default:
                System.out.println("Invalid choice. Please select a valid operation.");
        }
        scanner.close();
    }
}
