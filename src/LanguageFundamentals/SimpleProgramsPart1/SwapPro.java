package LanguageFundamentals.SimpleProgramsPart1;

public class SwapPro{
    public static void main(String args[]){
        int a = 12;
        int b = 34,temp;
        System.out.println("======Values before swapping======");
        System.out.println("Value of A = "+a);
        System.out.println("Value of B = "+b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("======Values after swapping======");
        System.out.println("Value of A = "+a);
        System.out.println("Value of B = "+b);
    }
}
