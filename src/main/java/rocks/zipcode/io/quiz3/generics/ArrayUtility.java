package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        HashMap<SomeType, Integer> map = mapMaker();
        return mapEvaluator(map, 1);
    }

    public SomeType findEvenOccurringValue() {
        HashMap<SomeType, Integer> map = mapMaker();
        return mapEvaluator(map, 0);
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        HashMap<SomeType, Integer> map = mapMaker();
        return map.get(valueToEvaluate);
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        SomeType[] temp = array.clone();
        int index = 0;
        for (SomeType object : array){
            if(predicate.apply(object)){
                temp[index++] = object;
            }
        }
        SomeType[] result = Arrays.copyOf(temp, index);
        return result;
    }

    private HashMap<SomeType, Integer> mapMaker() {
        HashMap<SomeType, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++){
            SomeType current = array[i];
            Set<SomeType> keys = map.keySet();
            boolean flag = false;
            for (SomeType key : keys){
                if (current.equals(key)){
                    Integer val = map.get(key);
                    map.put(key, ++val);
                    flag = true;
                    break;
                }
            }
            if(!flag){
                map.put(current, 1);
            }
        }
        return map;
    }

    private SomeType mapEvaluator(HashMap<SomeType, Integer> map, int i) {
        Set<SomeType> keys = map.keySet();
        for (SomeType key : keys){
            Integer value = map.get(key);
            if ((value + i) % 2 == 0){
                return key;
            }
        }
        return null;
    }
}
