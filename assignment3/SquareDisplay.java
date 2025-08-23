/* 2023-10-9  | Assignment 3 - Square Display*/
package MB.assignment3;

import java.util.Scanner;

public class SquareDisplay {

public static void main(String[] args){
Scanner myKeyboard = new Scanner(System.in);

System.out.println("Enter positive int no greater than 15");
int userChar = myKeyboard.nextInt();

for(int x=0; x <= userChar; x++){
    System.out.println("x");

    for(int y=0; y <= userChar; y++){
    System.out.print("y");
    }
}

}  
}