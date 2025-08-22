/*2023-9-12
Assignment 1-12 String Manipulator
*/
package MB.assignment1;
import java.util.Scanner;
public class stringManipulatorMB {
public static void main(String[] args){
Scanner myKeyboard = new Scanner(System.in);

System.out.println("Enter the name of your favorite city");//prompt
String favCity = myKeyboard.nextLine(); //capture input into (newly declared) var

//number of chars
int favCityCharLen = favCity.length();

//convert to upper
String favCityUpper = favCity.toUpperCase();

//convert to lower
String favCityLower = favCity.toLowerCase();

//get first char
char favCityFirstChar = favCity.charAt(0);


System.out.println("City - " + favCity);
System.out.println("name length: " + favCityCharLen);
System.out.println("all upper: " + favCityUpper);
System.out.println("all lower:" + favCityLower);
System.out.println("first character:" + favCityFirstChar);

}
}


//7, 10, 12 done 2.5 hours