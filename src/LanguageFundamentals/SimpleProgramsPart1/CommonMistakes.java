package LanguageFundamentals.SimpleProgramsPart1;

public class CommonMistakes{

    static int printInteger(int n){
        return n;
    }

    static int printFact(int f){
        int fact = 1;
        for(int i=1;i<=f;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String args[]){
        //Infinite Loop
        //for(int i=10;i>2;i++){
        //	System.out.println("Value = "+i);
        //}

        int a = 33;
        //if(a==3);
        //	System.out.println("a values is 3");

        if(a==3)
            System.out.println("a values is 3");

        int num = printInteger(24);
        System.out.println("Value = "+num);
        int g = 5;
        System.out.println("Factorial of "+g+" is "+printFact(g));
    }
}
