package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder stringBuilder = new StringBuilder(str);
        Character character = Character.toUpperCase(str.charAt(indexToCapitalize));
        stringBuilder = stringBuilder.replace(indexToCapitalize, indexToCapitalize+1, character.toString());
        return stringBuilder.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return characterToCheckFor.equals(baseString.charAt(indexOfString));
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> allSubStrings = new LinkedHashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                allSubStrings.add(string.substring(i, j));
            }
        }
        return allSubStrings.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
