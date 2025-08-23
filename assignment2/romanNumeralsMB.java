/* 2023-9-28  Lab 2 - Roman Numerals*/
package MB.assignment2;
import java.util.Scanner;
public class romanNumeralsMB {
public static void main(String[] args){
Scanner myKeyboard = new Scanner(System.in);

System.out.println("enter a number 1-10 to find roman numeral");
String userInput = myKeyboard.nextLine();

switch(userInput){
    case "1":
        System.out.println("I");
        break;
    case "2":
        System.out.println("II.");
        break;
    case "3":
        System.out.println("III");
        break;
    case "4":
        System.out.println("IV");
        break;
    case "5":
        System.out.println("V");
        break;
    case "6":
        System.out.println("VI");
        break;
    case "7":
        System.out.println("VII");
        break;
    case "8":
        System.out.println("VIII");
        break;
    case "9":
        System.out.println("IX");
        break;
    case "10":
        System.out.println("IX");
        break;

    default:
        System.out.println("Invalid choice.");
    }

}
}