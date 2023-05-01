package CommonPractices.InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindFirstUniqueChar {
    public static int firstUniqChar(String s) {
        Map<Character,Integer> fmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(fmap.containsKey(s.charAt(i))){
                fmap.put(s.charAt(i),fmap.get(s.charAt(i))+1);
            }else{
                fmap.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<s.length();i++){
            if(fmap.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str="loveleetcode";
        System.out.println(firstUniqChar(str));
    }
}
