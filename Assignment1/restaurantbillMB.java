/*2023-9-12 
Assignment 1-13 Restaurant Bill
compute tax and tip amount based on a given subtotal. 
Tax % is 0.0675 Tip is 0.20
*/
package MB.assignment1;
import java.util.Scanner;
public class restaurantbillMB {
public static void main(String[] args){
Scanner myKeyboard = new Scanner(System.in);

System.out.println("Enter amt");//prompt
double subTotal = myKeyboard.nextDouble(); //capture input into var
double taxPct = 0.0675;
double tipPct = 0.20;
double taxTotal = (subTotal * taxPct);
double tipTotal = (subTotal * tipPct);
double finalTotal = (subTotal + tipTotal + taxTotal);

System.out.println("Meal Charge (subtotal): $" + subTotal);

System.out.println("Tax: $" + 
String.format("%.2f" , taxTotal));//float precison 2 places

System.out.println("Tip: $" + 
String.format("%.2f" , tipTotal));//float precison 2 places

System.out.println("Total Charge: $" +
String.format("%.2f" , finalTotal));//float precison 2 places


}
}
