package String;

public class FindPalindrome {
    public boolean isPalindrome(String s) {
        if(s == null || s.trim().isEmpty()){
            return true;
        }
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while(leftPointer <= rightPointer){
            while (!isAlphanumeric(s.charAt(leftPointer))){
                leftPointer++;
            }
            while(!isAlphanumeric(s.charAt(rightPointer))){
                rightPointer--;
            }

            if(leftPointer > rightPointer){
                break;
            }
            if(Character.toLowerCase(s.charAt(leftPointer)) !=
                    Character.toLowerCase(s.charAt(rightPointer))){
                return false;
            }
            leftPointer++;
            rightPointer--;
        }

        return true;
    }

    private boolean isAlphanumeric(char ch){
        return (ch >= 'a' && ch <='z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <='9');
    }
}
