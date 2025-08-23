/* 2023-9-28  Lab 2 - Body Mass Index */
package MB.assignment2;
import java.util.Scanner;
public class bodyMassIndexMB {
public static void main(String[] args){
Scanner myKeyboard = new Scanner(System.in);

System.out.println("Enter Weight in Pounds");
int weight = myKeyboard.nextInt();
System.out.println("Enter Height in Inches");
int height = myKeyboard.nextInt();
double BMI = (weight * 703) / (height * height);

System.out.println("Weight:" + weight + " pounds");
System.out.println("Height:" + height + " inches");
System.out.println("BMI: " + BMI);

if(BMI < 18.5){ System.out.println("underweight");}
if(BMI > 25){ System.out.println("overweight");}
else System.out.println("optimal");

}
}