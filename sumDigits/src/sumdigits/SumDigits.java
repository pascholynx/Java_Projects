package sumdigits;

import java.util.Scanner;

public class SumDigits {

    public static void main(String[] args) {
       System.out.println("Welcome to SumDigits");
       System.out.println("Enter your Integer: ");
        
       Scanner scan = new Scanner(System.in);
        
       String num = scan.nextLine();
       int sum = 0;
       int counter = num.length();
       
       while(counter >0){
           char eachdigit = num.charAt(counter-1);
           sum = sum + Integer.parseInt(String.valueOf(eachdigit));
           counter--;
       }
       
       System.out.println("The sum of the digits of your integer is "+sum);
    }
    
}
