package exponentor;

import java.util.Scanner;

public class Exponentor {
    
    public static void main(String[] args) {
        //Welcome the User
       System.out.println("Welcome to Exponentor");
       
       //Instruct the user to supply the Base Number
       System.out.println("Enter the Base Number:");
       
       //Create a Scanner
       Scanner scan = new Scanner (System.in);
       
       //Capture the Base Number
       int baseNumber = scan.nextInt();
       
       //Instruct the user to supply the Exponent
       System.out.println("Enter the Exponent:");
       
       //Capture the Exponent
       int exponent = scan.nextInt();
       
       //Peform the computation
       double answer = Math.pow(baseNumber, exponent);
       
       //Display the result of the computation
       System.out.println("Your Answer is to "+baseNumber +"raised to the power of "+exponent +" is "+answer);
    }
    
}
          