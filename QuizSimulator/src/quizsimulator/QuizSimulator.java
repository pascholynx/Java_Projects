package quizsimulator;

import java.util.Random;
import java.util.Scanner;

public class QuizSimulator {

    private static int i;

    public static void main(String[] args) {
        // Welcome the User
        System.out.println("Welcome to Quiz Simulator!!");

        //Ask the User the number of questions the want to solve
        System.out.print("How many Questions do you want to answer? ");

        // Create a scanner
        Scanner scan = new Scanner(System.in);

        //Capture the Number of Questions
        int numOfQuestions = scan.nextInt();

        // Intitalize the score
        int score = 0;

        for (i = 1; i <= numOfQuestions; i++) {
            // Generate random numbers for the question
            int num1 = generateRandomNumber();
            int num2 = generateRandomNumber();

            // Randomly choose between addition and subtraction
            boolean operator = generateRandomBoolean();

            //Display Question
            System.out.print("Question " + i + ": " + num1 + (operator ? " + " : " - ") + num2 + " =  ");

            // Capture the start time
            long startTime = System.currentTimeMillis();

            // Capture the answer
            int userAnswer = scan.nextInt();

            // Capture the end time
            long endTime = System.currentTimeMillis();

            // Check if the answer is correct and within 7 seconds
            if (endTime - startTime <= 7000 && userAnswer == (operator ? num1 + num2 : num1 - num2)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }
        
        

        // Display the Score
        System.out.println("\nQuiz completed!");
        System.out.println("Your score: " + score + " out of " + numOfQuestions);

        // Display the Percentage Value of the Answer
        double percentage = (double) score / numOfQuestions * 100;
        System.out.println("Percentage: " + percentage + "%");

    }

    // Method to generate random numbers for the questions
    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100); // Generates random two-digit numbers (0 to 99)
    }

    // Method to generate random boolean for addition or subtraction
    private static boolean generateRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
