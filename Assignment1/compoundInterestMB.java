/*2023-9-12 
Assignment 1 - 21 Compound Interest
*/
package MB.assignment1;
import java.util.Scanner;
import java.lang.Math;
public class compoundInterestMB {
public static void main(String[] args){
Scanner myKeyboard = new Scanner(System.in);

//COLLECT INPUT

//P - original principal
System.out.println("enter original principal");
double originalAmt = myKeyboard.nextDouble();

//R - annual interest rate
System.out.println("enter annual interest rate");
double interestRate = myKeyboard.nextDouble();

//N - number of times per year interest is compounded
System.out.println("enter compound interest qty");
double compoundQty = myKeyboard.nextDouble();

//T - time in years the account will earn interest
System.out.println("enter number of years");
double yearDuration = myKeyboard.nextDouble(); 

/*
Formula
A = P ( 1 + (R/N))^ N*T
*/


double interestEarned = Math.pow(1 + (interestRate/compoundQty),compoundQty*yearDuration);
double finalAmount = originalAmt + interestEarned;

System.out.println("Original amount is: $" + originalAmt);
System.out.println("Interest Rate: " + interestRate + "%");
System.out.println("number of times per year: " + compoundQty);
System.out.println("number of years: " + yearDuration);
System.out.println("Resulting sum: " + finalAmount);




}
}
