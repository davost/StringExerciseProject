package se.lexicon;
import static se.lexicon.StringLengths.findLength;
import static se.lexicon.IndexPosition.findChar;
import static se.lexicon.IndexPositionTwo.findIndex;

public class App
{
    public static void main( String[] args )
    {
        //1. What is the length of the String: "Java" ?
        findLength();

        System.out.println("-----------------");

        //1.1 What char is at index position 6 in the following String: "Long example sentence" ?
        findChar();

        System.out.println("-----------------");

        //2. What is the index position of 'o' in the following String: "Even longer example sentence" ?
        findIndex();

        System.out.println("-----------------");

        //


    }
}
