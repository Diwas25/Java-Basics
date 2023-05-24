package InterviewProblems;

import java.util.HashMap;

public class printThirdNonRepeatedCharDemo {
    public static char printThirdNonRepeatedChar(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        int count = 0;
        char result = '\0';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charCount.get(ch) == 1) {
                count++;
                if (count == 3) {
                    result = ch;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String sname = "preeti";
        System.out.println(printThirdNonRepeatedChar(sname));
    }
}
