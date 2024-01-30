// This is the second assignment for Group 9
package circlify;

import java.util.Scanner;

public class Circlify {

    public static void main(String[] args) {
       // Welcome the User
       System.out.println("Welcome to Circlify");
       
       // Ask the user to input the radius
       System.out.print("Enter the radius of the circle: ");
      
       // Capture the radius of the circle
       int radius = new Scanner(System.in).nextInt();
       
       // Find the area of the circle using the radius
       double area = (Math.PI * Math.pow(radius, 2));
       
       // Convert to radians
       double sectorAngle = Math.toRadians(65);
       double circleAngle = Math.toRadians(360);
       
       // Perform the Calculation for the area of the sector
       double sectorArea = ((sectorAngle/circleAngle)*(area));
       
       // Display results to the User
       System.out.println("The area of the circle with radius "+radius+" is "+area);
       System.out.println("The area subtended by a sector of 65 degrees angle with radius "+radius+" is "+sectorArea);
       
    }

}