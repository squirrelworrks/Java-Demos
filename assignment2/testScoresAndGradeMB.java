/* 2023-9-28 | Lab 2 - Test Scores and Grade */
package MB.assignment2;
import java.util.Scanner;
public class testScoresAndGradeMB {
public static void main(String[] args){
Scanner myKeyboard = new Scanner(System.in);

String letterGrade = "Z"; //init for use in IF statements
System.out.println("Here you will enter 3 test scores");
System.out.println("Enter Score 1");
double score1 = myKeyboard.nextDouble();
System.out.println("Enter Score 2");
double score2 = myKeyboard.nextDouble();
System.out.println("Enter Score 3");
double score3 = myKeyboard.nextDouble();

double scoreAverage = ((score1 + score2 + score3)/3);

if (scoreAverage >= 90 && scoreAverage <= 100 ){
    letterGrade="A";
}
else if (scoreAverage >= 80 && scoreAverage <= 89 ){
    letterGrade="B";
}
else if (scoreAverage >= 70 && scoreAverage <= 79 ){
    letterGrade="C";
}
else if (scoreAverage >= 60 && scoreAverage <= 69 ){
    letterGrade="D";
}
else if (scoreAverage <= 68 ){
    letterGrade="F";
}

System.out.println("----------------------------------");
System.out.println("Letter grade is " + letterGrade);

System.out.println("Average of your scores: " + 
String.format("%.2f" , scoreAverage));//float precison 2 places
System.out.println("----------------------------------");

}
}