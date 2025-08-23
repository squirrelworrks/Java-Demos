/* 2023-10-9  | Assignment 3 - Largest and Smallest*/

package JAVA.assignment3;
import java.util.Scanner;
public class LargestAndSmallest {
public static void main(String[] args){
Scanner myKeyboard = new Scanner(System.in);
int targetInt=99;//end condition
int low=99; /*init as 99 since all numbers must be lower than this. 
The variable is intended to immediatley be set to another number, 
but we cant init as 0, in case user enters a number lower than 0...*/
int high=0;//
int userInput;

System.out.println("Enter a series of integers... Enter 99 to end.");

do{
    userInput = myKeyboard.nextInt();
    if (userInput < low){//not <=
        low=userInput;
    }
    if (userInput >high){ //not >=
        high=userInput;
    }
}
while (userInput != targetInt); 

System.out.println("---Results---");
System.out.println("Low: "+ low);
System.out.println("High: " + high);
System.out.println("------------");
}  //end main()
}