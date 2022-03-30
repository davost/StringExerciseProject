package se.lexicon;

import java.lang.String.*;

public class ConvertToString {
    public static void convertToString() {
        //7. Parse the following int: 20 to a String and add a 20 to the
        //end of the String. Printing it out should return: "2020".
        int num20 = 20;
        String numFive = Integer.toString(num20);

        System.out.println(numFive.concat("20"));

    }
}
