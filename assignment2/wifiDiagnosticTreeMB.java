/* 2023-9-28 | Lab 2 - Wi-fi Diagnostic Tree 

INCOMPLETE 10-18
*/

package MB.assignment2;
import java.util.Scanner;
public class wifiDiagnosticTreeMB {
public static void main(String[] args){
Scanner myKeyboard = new Scanner(System.in);

        
System.out.println("Reboot the computer and try to connect:");
System.out.println("Did that fix the problem?");
String userInput = myKeyboard.nextLine();
System.out.println("You answered " + userInput);

if(userInput.equals("n") || userInput.equals("N") ){
    System.out.println("Reboot the router and try to connect.");
    System.out.println("Did that fix the problem?");
    userInput = myKeyboard.nextLine();
    System.out.println("You answered " + userInput);

else if(userInput.equals("y") || userInput.equals("Y") ){  
 System.out.println("You answered " + userInput);
}

    if(userInput.equals("n") || userInput.equals("N") ){
        System.out.println("Make sure the cables between the router & model are plugged in firmly.");
        System.out.println("Did that fix the problem?");
        userInput = myKeyboard.nextLine();
        System.out.println("You answered " + userInput);

        if(userInput.equals("n") || userInput.equals("N") ){
            System.out.println("Move the router to a new location");
            System.out.println("Did that fix the problem?");
            userInput = myKeyboard.nextLine();
            System.out.println("You answered " + userInput);

            if(userInput.equals("n") || userInput.equals("N") ){
                System.out.println("Get a new router");
            }
        }
    }
}



/*



        if(userInput == "y"){N

            System.out.println("You answered " + userInput);
            System.out.println("Problem solved.");
        }

        else 

            System.out.println("You answered " + userInput);
 System.out.println("");

        }
        
        







        //answer = myKeyboard.nextLine(); 

        System.out.println("Default: Get a new router");

        //System.out.println(answer);

*/

    }

}

