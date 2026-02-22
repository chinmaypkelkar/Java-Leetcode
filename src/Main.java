import Array.ConvertToTitle;
import Array.EncodeAndDecode;
import Array.SearchMatrix;
import SlidingWindow.MinSubArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       String s = "/..//_home/a/b/..///";
       String[] s1 = s.split("/");
       System.out.println(Arrays.stream(s1).toList());

        ConvertToTitle convertToTitle = new ConvertToTitle();
        convertToTitle.convertToTitle(701);
    }
}