/* 2023-10-9  | Assignment 3 - Sum of Numbers*/

package MB.assignment3;
import java.util.Scanner;
public class SumOfNumbers {
public static void main(String[] args){
Scanner myKeyboard = new Scanner(System.in);
System.out.println("Enter a positive nonzero integer (X) and the app will return sum of all integers from 1 to X.");
int userDefinedCeiling = myKeyboard.nextInt(); //user defines how high to count
int accumulator = 0; //to store running total 
int increment = 1; // count from 1 to ceiling in increments of X.. use this to increment loop

    for (int digit = 1; digit <= userDefinedCeiling; digit=digit+increment){
        accumulator += digit; //Which iteration is this? -- That # goes into accumulator.
        //accumulator = accumulator + digit

        if (digit==userDefinedCeiling){
        //check for final line of output, to refine user message
            System.out.println("int: " + digit + " Grand Total: " + accumulator);
        }
        else
            System.out.println("int: " + digit + " Total: " + accumulator);
        
    }
}  
}