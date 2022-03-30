package se.lexicon;

import java.util.Locale;

public class LowerUpperCase {
    public static void changeToUpperLowerCase() {
        //4. Convert the following String: "CAPS EQUALS SCREAMING" to lowercase and print.
        //Then convert it back to uppercase and print it out again...

        String stringFive = "CAPS EQUALS SCREAMING";
        String stringSix = stringFive.toLowerCase();

        System.out.println(stringSix);

        String stringSeven = stringSix.toUpperCase();
        System.out.println(stringSeven);

    }
}
