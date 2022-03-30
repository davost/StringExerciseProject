package se.lexicon;

public class SubstringArray {
    public static void placeStringsInArray() {
        //8. Oil and water don't go well together. Given the String: "Oil and Water",
        // split them up into the words "Oil","Water" and store them in a String array
        String oilWater = "Oil and Water";
        String[] words = new String[2];
        words[0] = oilWater.substring(0,3);
        words[1] = oilWater.substring(8,13);


    }
}
