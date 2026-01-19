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

    public String encodeAnotherApproach(List<String> strs) {
        StringBuilder output = new StringBuilder();
        for(String str : strs){
            output.append(str.length()).append("#").append(str);
        }

        return output.toString();

    }

    public List<String> decodeAnotherApproach(String str) {
        List<String> output = new ArrayList<>();
        int i = 0;
        int start, end;
        while(i < str.length()){
            int lengthOfString = Integer.parseInt(String.valueOf(str.charAt(i)));
            start = i + 2;
            end = start + lengthOfString;
            output.add(str.substring(start,end));
            i = end;
        }
        return output;
    }

    private int getLength(int start, int end){

    }
}
