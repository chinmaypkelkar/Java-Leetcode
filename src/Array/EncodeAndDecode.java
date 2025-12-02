package Array;


import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecode {
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for(String str : strs){
            encodedString.append(str.length()).append("#").append(str);
        }
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int forwardPointer = i;
            while (str.charAt(forwardPointer) != '#') {
                forwardPointer++;
            }

            int length = Integer.parseInt(str.substring(i, forwardPointer));
            int start = forwardPointer + 1;
            int end = start + length;
            i = end;
            output.add(str.substring(start, end));
        }
        return output;
    }
}
