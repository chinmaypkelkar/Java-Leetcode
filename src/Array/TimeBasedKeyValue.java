package Array;

import java.util.HashMap;
import java.util.Map;

public class TimeBasedKeyValue {
    Map<String, Map<Integer,String>> inputMap;
    public TimeBasedKeyValue() {
        inputMap = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {

        inputMap.computeIfAbsent(key, k -> new HashMap<>()).put(timestamp, value);

    }

    public String get(String key, int timestamp) {
        if(!inputMap.containsKey(key)) return "";

        int nearOrEqualTimeStamp = 0;
        for(int currentTimeStamp : inputMap.get(key).keySet()){
            if(currentTimeStamp <= timestamp){
                nearOrEqualTimeStamp = Math.max(nearOrEqualTimeStamp,currentTimeStamp);
            }
        }
        return inputMap.get(key).get(nearOrEqualTimeStamp);

    }
}
