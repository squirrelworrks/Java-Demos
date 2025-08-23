/* 2023-10-9  | Assignment 3 - Uppsercase File Converter*/
package MB.assignment3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UppercaseFileConverter {
public static void main(String[] args){
//Scanner myKeyboard = new Scanner(System.in);
String readFilename = "readFile.txt";

try{
File sourceFile = new File(readFilename);
Scanner sourceScan = new Scanner(sourceFile);
String writeFile = "test.txt";

    while (sourceScan.hasNextLine()) {
        String sourceLine = sourceScan.nextLine();//call it source line
        System.out.println(sourceLine); //print it out
        String $product = sourceLine.toUpperCase(); //convert to upper and store in new var

        try {
            FileWriter myWriter = new FileWriter(writeFile);
            myWriter.write($product);
            myWriter.close();
            System.out.println("Converted to upper: " + $product);
            } 
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    //readScanner.close();
    }}

catch(FileNotFoundException x){
 System.out.println("error" + x);
}


}//end main()
}//end class uppercasefileconverter