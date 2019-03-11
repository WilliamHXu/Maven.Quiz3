package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String[] parsed = str.split(" ");
        String[] pigged = new String[parsed.length];
        for (int i = 0; i < parsed.length; i++) {
            String word = parsed[i];
            if(VowelUtils.startsWithVowel(word)){
                pigged[i] = word + "way";
            }
            else if(VowelUtils.hasVowels(word)){
                Integer index = VowelUtils.getIndexOfFirstVowel(word);
                pigged[i] = word.substring(index) + word.substring(0, index) + "ay";

            }
            else {
                pigged[i] = word + "ay";
            }
        }
        String result = "";
        for (int i = 0; i < pigged.length; i++) {
            result += pigged[i];
            if(i != pigged.length - 1){
                result += " ";
            }
        }
        return result;
    }
}
