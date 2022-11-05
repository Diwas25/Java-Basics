package LanguageFundamentals.Recursion;

public class RecursionDemo{
    static void printVar(int n) {
        System.out.println(n);
        printVar2(2);
    }
    static void printVar2(int n) {
        System.out.println(n);
        printVar3(3);
    }
    static void printVar3(int n) {
        System.out.println(n);
        printVar4(4);
    }
    static void printVar4(int n) {
        System.out.println(n);
        printVar5(5);
    }
    static void printVar5(int n) {
        System.out.println(n);
    }
    public static void main(String args[]){
        printVar(1);
    }
}
