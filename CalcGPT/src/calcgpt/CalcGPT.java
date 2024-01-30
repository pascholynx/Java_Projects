package calcgpt;

import java.util.Arrays;
import java.util.Scanner;

public class CalcGPT {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to CalcGPT");
        System.out.println("What would you like me do?");
        System.out.println("Enter a math question in the following format:");
        System.out.println("- Find the sum of the following numbers: 3,4,6,8");
        System.out.println("- Find the product of the following numbers: 3,4,6,8");
        System.out.println("- Find the difference between the following numbers: 6,4");
        
        String userQuestion = scan.nextLine();
        
        processMathQuestion(userQuestion);
    }
    
    public static void processMathQuestion(String question) {
        String[] parts = question.split(":");
       
        if (parts.length != 2) {
            System.out.println("Invalid question format: " + question);
        }
        
        String operation = parts[0].trim();
        String numbersString = parts[1].trim();
        
        // Split the string containing the list of numbers into an array, using commas as delimiters
        String[] numbers = numbersString.split(",");

        // Convert the array of strings (numbers) to an array of integers
        int[] intNumbers = Arrays.stream(numbers)
                          // Remove whitespace from each string in the array
                          .map(String::trim)
                          // Convert each string in the array to an integer
                          .mapToInt(Integer::parseInt)
                          // Collect the integers into an array of integers
                          .toArray();
        
        switch (operation) {
            case "Find the sum of the following numbers":
                int sum = Arrays.stream(intNumbers).sum();
                System.out.println("Sum: " + sum);
                break;
            case "Find the product of the following numbers":
                int product = Arrays.stream(intNumbers).reduce(1, (a, b) -> a * b);
                System.out.println("Product: " + product);
                break;
            case "Find the difference between the following numbers":
                if (intNumbers.length != 2) {
                    System.out.println("Invalid number of operands for subtraction");
                    return;
                }
                int difference = intNumbers[0] - intNumbers[1];
                System.out.println("Difference: " + difference);
                break;
            default:
                System.out.println("Invalid question format or Unsupported operation: " + operation);
        }

    }
}