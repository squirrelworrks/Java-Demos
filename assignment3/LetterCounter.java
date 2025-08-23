/* 2023-10-9  | Assignment 3 - Letter Counter*/

package MB.assignment3;
import java.util.Scanner;
public class LetterCounter {
public static void main(String[] args){
Scanner myKeyboard = new Scanner(System.in);

System.out.println("Enter a string to search.");
String fullString = myKeyboard.nextLine();

System.out.println("Enter a character to search for.");
String charString = myKeyboard.nextLine();
char targetChar = charString.charAt(0);
int matchQty=0; //init as 0 to allow increment within loop

for (int loop_iteration=1; loop_iteration < fullString.length(); loop_iteration++){
    if (fullString.charAt(loop_iteration) == targetChar){
            matchQty ++;
    }
}

System.out.println("The character \"" + targetChar + "\" appears " 
+ matchQty +  " times in your string, " + fullString);
}   
}