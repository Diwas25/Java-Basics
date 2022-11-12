package LanguageFundamentals.SimpleProgramsPart1;

public class SumDemo{

    static int calculateSumByFormula(int n){
        int c = n*(n+1)/2;
        return c;
    }
    static int calculateSumByLoop(int n){
        int sum = 0;
        for(int a=1;a<=n;a++){
            //System.out.println(a);
            sum = sum + a;
        }
        return sum;
    }
    public static void main(String args[]){

        System.out.println(calculateSumByFormula(10));
        System.out.println(calculateSumByLoop(10));
    }
}
