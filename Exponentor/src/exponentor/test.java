
package exponentor;

import java.util.Scanner;

public class test {
    
    public static void main (String[] args) {
       //Welcome the User
       System.out.println("Welcome to Exponentor");
       
       //Instruct the user to supply the First Number
       System.out.println("Enter the First Number:");
       
       //Create a Scanner
       Scanner scan = new Scanner (System.in);
       
       //Capture the Base Number
       int baseNumber = scan.nextInt();
       
       //Instruct the user to supply the Second Number
       System.out.println("Enter the Exponent:");
       
       //Capture the Exponent
       int exponent = scan.nextInt();
       
       //Peform the computation for exponent
       double answerE = Math.pow(baseNumber, exponent);
       
       //Peform the computation for Addition
       double answerA = Math.addExact(baseNumber, exponent);
       
       //Peform the computation for Subtraction
       double answerS = Math.subtractExact(baseNumber, exponent);
       
       //Peform the computation for Product
       double answerP = Math.multiplyExact(baseNumber, exponent);
       
       //Display the result of the computations
       System.out.println("Your Answer is to "+baseNumber +" raised to the power of "+exponent +" is "+answerE);
       System.out.println("Your Answer is to "+baseNumber +" Plus "+exponent +" is "+answerA);
       System.out.println("Your Answer is to "+baseNumber +" Minus "+exponent +" is "+answerS);
       System.out.println("Your Answer is to "+baseNumber +" Multiplied by "+exponent +" is "+answerP);
    }
}
