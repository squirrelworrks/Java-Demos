/* 2023-9-28 | Lab 2 - Sorted Names 

INCOMPLETE
*/
package MB.assignment2;
import java.util.Scanner;
public class sortedNamesMB {

public static void main(String[] args){
Scanner myKeyboard = new Scanner(System.in);

String name1, name2, name3;

System.out.println("Enter 3 names");
System.out.println("Enter Name 1");
name1 = myKeyboard.nextLine();
System.out.println("Enter Name 2");
name2 = myKeyboard.nextLine();
System.out.println("Enter Name 3");
name3 = myKeyboard.nextLine();

// test each name to find out which one is less
//need to sort the names in ascending order A-Z

int name1counter=0;
int name2counter=0;
int name3counter=0;

if (name1.compareTo(name2) < 0 ){ 
    name2counter++;
}
    else name1counter++;

if (name1.compareTo(name3) < 0 ){ 
    name3counter++;
}
    else name1counter++;


if (name2.compareTo(name3) < 0 ){ 
    name3counter++;
}
    else name2counter++;

if (name1.compareTo(name3) < 0 ){ 
    name3counter++;
}
    else name1counter++;


if (name2.compareTo(name1) < 0 ){ 
    name1counter++;
}
    else name2counter++;


System.out.println( name1counter + name1);
System.out.println( name2counter + name2);
System.out.println( name3counter + name3);






}
}