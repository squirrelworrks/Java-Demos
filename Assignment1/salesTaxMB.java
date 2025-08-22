/*2023-9-12 
Assignment 1-7 Sales Tax
*/
package MB.assignment1;
import java.util.Scanner;
public class salesTaxMB {
public static void main (String[] args){
Scanner myKeyboard = new Scanner(System.in);

double countyTaxRate = 0.04;
double stateTaxRate = 0.02;
double countyTaxRateCharge;
double stateTaxRateCharge;
double subTotal;
double finalTotal;

System.out.println("Enter amt");//prompt
subTotal = myKeyboard.nextDouble(); //capture input into var

//calculate TWO tax charges based on purchase amount
countyTaxRateCharge = (subTotal * countyTaxRate);
stateTaxRateCharge = (subTotal * stateTaxRate);
//final total is the sum of each tax charge to the original amount input by cashier
finalTotal = subTotal + countyTaxRateCharge + stateTaxRateCharge;

System.out.println("Collect: $" + 
    String.format("%.2f" , finalTotal));//float precison 2 places

}
}