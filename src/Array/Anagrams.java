package Array;


import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Anagrams {
    // Input: s = "racecar", t = "carrace"
    public boolean isAnagram(String s, String y) {
        if (s.length() != y.length()) {
            return false;
        }

        Map<Character, Integer> sInputMap = populateMap(s);
        Map<Character, Integer> yInputMap = populateMap(y);

        for(Map.Entry<Character, Integer> entry: sInputMap.entrySet()){
            Character key = entry.getKey();
            Integer value = entry.getValue();
            if(!yInputMap.containsKey(key)){
                return false;
            }
            if(yInputMap.containsKey(key) && !Objects.equals(yInputMap.get(key), value)){
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> populateMap(String input){
        Map<Character, Integer> InputMap = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (!InputMap.containsKey(input.charAt(i))) {
                InputMap.put(input.charAt(i), 1);
            } else {
                int value = InputMap.get(input.charAt(i));
                value++;
                InputMap.put(input.charAt(i), value);
            }
        }
        return InputMap;
    }
}
