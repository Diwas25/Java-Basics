import java.util.HashMap;
import java.util.Map;

public class Test {

    public static int ConvertToNumber(String s){
        Map<Character,Integer> convertor = new HashMap<>();
        convertor.put('I',1);
        convertor.put('V',5);
        convertor.put('X',10);
        convertor.put('L',50);
        convertor.put('C',100);
        convertor.put('D',500);
        convertor.put('M',1000);

        int result = convertor.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i>=0;i--){
            if(convertor.get(s.charAt(i)) < convertor.get(s.charAt(i+1))){
                result -= convertor.get(s.charAt(i));
            }
            else{
                result += convertor.get(s.charAt(i));
            }
        }
        return result;

    }

    public static String reverseString(String s){
        String resultString="";
        for(int i = s.length()-1; i>=0;i--){
            resultString += s.charAt(i);
        }

        return resultString;
    };

    public static void main(String[] args) {
//        String romanNum = "MCMXCIV";
//        System.out.println(ConvertToNumber(romanNum));

        String simpleString = "Kajal Diwas";
        System.out.println(reverseString(simpleString));

    }
}
