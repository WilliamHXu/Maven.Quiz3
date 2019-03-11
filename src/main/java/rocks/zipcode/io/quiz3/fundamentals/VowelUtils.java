package rocks.zipcode.io.quiz3.fundamentals;

import com.sun.xml.internal.fastinfoset.util.CharArray;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        boolean flag = false;
        char[] charArray = word.toCharArray();
        for (Character character : charArray){
            if (isVowel(character)){
                flag = true;
            }
        }
        return flag;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer result = null;
        char[] charArray = word.toCharArray();
        for (int i = 0; i < charArray.length; i++){
            Character character = charArray[i];
            if (isVowel(character)){
                result = i;
                break;
            }
        }
        return result;
    }


    public static Boolean startsWithVowel(String word) {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character) {
        boolean flag = false;
        if (character.equals('a') || character.equals('e') || character.equals('i') || character.equals('o') || character.equals('u') ||
                character.equals('A') || character.equals('E') || character.equals('I') || character.equals('O') || character.equals('U')){
            flag = true;
        }
        return flag;
    }
}
