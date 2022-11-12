package LanguageFundamentals.SimpleProgramsPart1;

public class MethodOverloadingDemo{

    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
    static double add(double a, double b){
        return a+b;
    }

    public static void main(String args[]){
        System.out.println("Double Addition = "+add(34.34,12.45));
        System.out.println("Integer Addition = "+add(34,12));
        System.out.println("Integer Addition2 = "+add(34,12,10));
    }
}
