package se.lexicon;

import java.lang.String;
import java.util.Scanner;

public class ConvertToCharPrintCharArray {
    public static void printCharArray() {
        //10. Convert the following String: "ThisShouldBeConverted" to a char array.
        // Iterate through the char array and print out each element.


        String stringToConvert = "ThisShouldBeConverted";
        char chars[] = stringToConvert.toCharArray();

        for(char c: chars) {
            System.out.println(c);
        }

       }
}
