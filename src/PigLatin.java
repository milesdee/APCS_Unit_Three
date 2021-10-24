import java.awt.*;
import java.sql.Array;
import java.util.List;
import java.util.Locale;

public class PigLatin {
    public static int firstVowel(String word){
        word = word.toLowerCase();
        int firstVowelLocation = Integer.MAX_VALUE;
        if (word.contains("a")){
            if (word.indexOf("a") < firstVowelLocation) firstVowelLocation = word.indexOf("a");
        }
        if (word.contains("e")) {
            if (word.indexOf("e") < firstVowelLocation) firstVowelLocation = word.indexOf("e");
        }
        if (word.contains("i")){
            if (word.indexOf("i") < firstVowelLocation) firstVowelLocation = word.indexOf("i");
        }
        if (word.contains("o")){
            if (word.indexOf("o") < firstVowelLocation) firstVowelLocation = word.indexOf("o");
        }
        if (word.contains("u")) {
            if (word.indexOf("u") < firstVowelLocation) firstVowelLocation = word.indexOf("u");
        }
        return firstVowelLocation;
    }
    public static String makePigLatin(String word) {
        word = word.toLowerCase();
        int firstVowelLocation = PigLatin.firstVowel(word);
        String translation;
        if (firstVowelLocation == 0){
            translation = word + "yay";
        }
        else if (word.contains("y")) {
            if (word.indexOf("y") != 0){
                if (word.indexOf("y") < firstVowelLocation) firstVowelLocation = word.indexOf("y");
                translation = word.substring(firstVowelLocation) + word.substring(0,firstVowelLocation) + "ay";
            }
            else translation = word.substring(firstVowelLocation) + word.charAt(0) + "ay";

        }
        else{
            translation = word.substring(firstVowelLocation) + word.substring(0,firstVowelLocation) + "ay";
        }
        return translation;
    }

}
