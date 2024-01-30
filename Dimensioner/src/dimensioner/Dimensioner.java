package dimensioner;

import java.util.Scanner;

public class Dimensioner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome, Sarah! Let's find the dimensions of your rectangular garden.");

        // Input: Total area of the garden
        System.out.print("Enter the total area of the garden in square meters (or press Enter for default): ");
        String userInput = scan.nextLine();

        RectangularGarden garden;

        if (userInput.isEmpty()) {
            // Use default area if the user didn't provide one
            garden = new RectangularGarden();
            System.out.println("Default area of 40 square meters is be used.");
            System.out.println("Default difference of 3  meters is be used.");
        } else {
            // Parse user input if provided
            double totalArea = Double.parseDouble(userInput);
            garden = new RectangularGarden(totalArea);
            
            // Input: Length difference
            System.out.print("Enter the difference between length and width: ");
            String lengthDifferenceInput = scan.nextLine();
            if (lengthDifferenceInput.isEmpty()) {
                garden = new RectangularGarden();
                
            } else {
                double lengthDifference = Double.parseDouble(lengthDifferenceInput);
                garden.setLengthDifference(lengthDifference);
            }
        }

        // Calculate and display dimensions
        garden.calculateDimensions();
        garden.displayDimensions();

        scan.close();
        
    }
}
