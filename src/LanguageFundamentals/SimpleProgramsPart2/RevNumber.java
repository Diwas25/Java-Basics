package LanguageFundamentals.SimpleProgramsPart2;

public class RevNumber {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int num = 2345;
        int rem,rev = 0;
        while(num != 0){
            rem = num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        System.out.println(rev);
    }
}
