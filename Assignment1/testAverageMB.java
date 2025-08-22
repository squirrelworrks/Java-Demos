/*2023-9-12 
Assignment 1-10 Test Average
*/

package MB.assignment1;
import java.util.Scanner;
public class testAverageMB {
public static void main(String[] args){
Scanner myKeyboard = new Scanner(System.in);

double score1,score2,score3,scoreAverage;

System.out.println("Find average of 3 test scores:");//prompt

System.out.println("Enter Score 1");//prompt
score1 = myKeyboard.nextDouble(); //capture input into var

System.out.println("Enter Score 2");//prompt
score2 = myKeyboard.nextDouble(); //capture input into var

System.out.println("Enter Score 3");//prompt
score3 = myKeyboard.nextDouble(); //capture input into var

scoreAverage = (score1 + score2 + score3) / 3 ;

System.out.println("Scores:" + score1 + ", " + score2 + ", " + score3);
System.out.println("Average:" + scoreAverage);


}    
}
