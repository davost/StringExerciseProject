package se.lexicon;
import static se.lexicon.StringLengths.findLength;
import static se.lexicon.IndexPosition.findChar;
import static se.lexicon.IndexPositionTwo.findIndex;
import static se.lexicon.SubstringExercise.findSubstring;
import static se.lexicon.LowerUpperCase.changeToUpperLowerCase;
import static se.lexicon.ReplaceStrings.replaceString;
import static se.lexicon.TrimString.trimmingString;
import static se.lexicon.ConvertToString.convertToString;
import static se.lexicon.SubstringArray.placeStringsInArray;
import static se.lexicon.PrintSubstringArray.printSubstringArray;

public class App
{
    public static void main( String[] args )
    {
        //1. What is the length of the String: "Java" ??
        findLength();

        System.out.println("-----------------");

        //1.1 What char is at index position 6 in the following String: "Long example sentence" ?
        findChar();

        System.out.println("-----------------");

        //2. What is the index position of 'o' in the following String: "Even longer example sentence" ?
        findIndex();

        System.out.println("-----------------");

        //3. Given the following String: "Ok this is not as long!" create a substring
        // of only "not as long" (excluding the exclamation point) and print it out.
        findSubstring();

        System.out.println("-----------------");

        //4. Convert the following String: "CAPS EQUALS SCREAMING" to lowercase and print.
        //Then convert it back to uppercase and print it out again.
        changeToUpperLowerCase();

        System.out.println("-----------------");

        //5. Correct the following String: "Java is the worst programming language!" by replacing
        // the (obviously incorrect) word "worst" with the word "best". Then print the sentence.
        replaceString();

        System.out.println("-----------------");

        //6. What is the output of the following String: "\tJ\ta\tv\ta\t" after you trim it?
        trimmingString();

        System.out.println("-----------------");

        //7. Parse the following int: 20 to a String and add a 20 to the
        //end of the String. Printing it out should return: "2020".
        convertToString();

        System.out.println("-----------------");

        //8. Oil and water don't go well together. Given the String: "Oil and Water",
        // split them up into the words "Oil","Water" and store them in a String array
        placeStringsInArray();

        System.out.println("-----------------");

        //9. Split the following String: "Carl,Susie,Fredrick,Bob,Erik"
        //into an array. Print out all names separately.
        printSubstringArray();

        System.out.println("-----------------");


    }
}
