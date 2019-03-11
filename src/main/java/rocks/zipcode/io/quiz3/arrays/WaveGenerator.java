package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String[] result = new String[0];
        String lowerCase = str.toLowerCase();
        for (int i = 0; i < lowerCase.length(); i++){
            Character character = lowerCase.charAt(i);
            if(character >= 'a' && character <= 'z'){
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = waveHelper(lowerCase, i);
            }
        }
        return result;
    }

    private static String waveHelper(String lowerCase, int i) {
        return StringUtils.capitalizeNthCharacter(lowerCase, i);
    }
}
