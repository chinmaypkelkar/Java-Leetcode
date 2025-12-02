package Array;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, ArrayList<String>> input = new HashMap<>();
        List<List<String>> output = new ArrayList<>();
        for(String str : strs){
            int hash = createHash(str);
            if(input.containsKey(hash)){
                ArrayList<String> in = input.get(hash);
                in.add(str);
                input.put(hash, in);
            }else {
                ArrayList<String> intr = new ArrayList<>();
                intr.add(str);
                input.put(hash, intr);
            }
        }

        input.forEach((k,v) -> output.add(v));
        return output;

    }

    private int createHash(String str){
        if(str.isEmpty()){
            return -1;
        }
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return Arrays.hashCode(charArray);
    }
}

