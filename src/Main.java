import Array.EncodeAndDecode;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EncodeAndDecode encodeAndDecode = new EncodeAndDecode();
        String encodedString = encodeAndDecode.encodeAnotherApproach(List.of("we","say",":","yes","!@#$%^&*()"));
        encodeAndDecode.decodeAnotherApproach(encodedString);
    }
}