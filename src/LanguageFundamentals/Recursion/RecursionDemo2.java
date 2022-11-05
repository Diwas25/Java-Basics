package LanguageFundamentals.Recursion;

public class RecursionDemo2{
    static void printVar(int n) {
        if(n==5) {
            System.out.println(5);
            return;
        }
        System.out.println(n);
        printVar(n+1);
    }
    public static void main(String args[]){
        printVar(1);

    }
}
