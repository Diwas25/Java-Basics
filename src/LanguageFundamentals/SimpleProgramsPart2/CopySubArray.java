package LanguageFundamentals.SimpleProgramsPart2;

public class CopySubArray {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char[] charFrom = {'d','e','c','a','f','f','e','i','n','a'};
        char[] copyTo = new char[7];

        System.arraycopy(charFrom, 2, copyTo, 0, 7);
        System.out.println(copyTo);
    }
}
