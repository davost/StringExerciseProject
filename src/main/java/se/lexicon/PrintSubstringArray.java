package se.lexicon;

import java.lang.String;

public class PrintSubstringArray {
    public static void printSubstringArray() {
        //9. Split the following String: "Carl,Susie,Fredrick,Bob,Erik"
        //into an array. Print out all names separately.

        String peopleNames = "Carl,Susie,Fredrick,Bob,Erik";
        String[] nameArray = new String[5];
        nameArray[0] = peopleNames.substring(0, 4);
        nameArray[1] = peopleNames.substring(5, 10);
        nameArray[2] = peopleNames.substring(11,19);
        nameArray[3] = peopleNames.substring(20,23);
        nameArray[4] = peopleNames.substring(24,28);

        System.out.println(nameArray[0] + " " + nameArray[1] + " " + nameArray[2] +
                " " + nameArray[3] + " " + nameArray[4]);
    }
}