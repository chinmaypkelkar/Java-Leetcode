package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
     public int lengthOfLongestSubstring(String s) {
            Set<Character> inputSet = new HashSet<Character>();
            int maxLength = 0;
            for(int i = 0;i<s.length();i++){
                if(!inputSet.contains(s.charAt(i))){
                    inputSet.add(s.charAt(i));
                }else{
                    maxLength = Math.max(inputSet.size(), maxLength);
                    inputSet.clear();
                    inputSet.add(s.charAt(i));
                }
            }
            return maxLength;

            
        }

}
