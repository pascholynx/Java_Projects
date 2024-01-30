// This is the Assignment for Group 9

package numcalc;

import java.util.Scanner;

public class NumCalc {

    public static void main(String[] args) {
        //Welcome the User
       System.out.println("Welcome to NumCalc");
       
       //Instruct the user to supply the First Number
       System.out.println("Enter the First Number:");
       
       //Create a Scanner
       Scanner scan = new Scanner (System.in);
       
       //Capture the First Number
       int num1 = scan.nextInt();
       
       //Instruct the user to supply the Second Number
       System.out.println("Enter the Second Number:");
       
       //Capture the Second Number
       int num2 = scan.nextInt();
       
       //Peform the computation for exponent
       double answerE = Math.pow(num1, num2);
       
       //Peform the computation for Addition
       double answerA = Math.addExact(num1, num2);
       
       //Peform the computation for Subtraction
       double answerS = Math.subtractExact(num1, num2);
       
       //Peform the computation for Product
       double answerP = Math.multiplyExact(num1, num2);
       
       //Display the result of the computations
       System.out.println("Your Answer is to "+num1 +" raised to the power of "+num2 +" is "+answerE);
       System.out.println("Your Answer is to "+num1 +" Plus "+num2 +" is "+answerA);
       System.out.println("Your Answer is to "+num1 +" Minus "+num2 +" is "+answerS);
       System.out.println("Your Answer is to "+num1 +" Multiplied by "+num2 +" is "+answerP);
    }
    
}
