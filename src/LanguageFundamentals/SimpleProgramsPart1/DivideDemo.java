package LanguageFundamentals.SimpleProgramsPart1;

public class DivideDemo{
    public static void main(String args[]){
        double num1 = 895;
        double num2 = 13;

        double numQutnt, numRem;

        numQutnt = num1/num2;
        numRem = num1%num2;
        System.out.println("number 1 is "+num1);
        System.out.println("number 2 is "+num2);

        System.out.println("Quotient is "+numQutnt);
        System.out.println("Remainder is "+numRem);
    }
}
