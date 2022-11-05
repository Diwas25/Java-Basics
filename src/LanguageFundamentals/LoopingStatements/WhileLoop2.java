package LanguageFundamentals.LoopingStatements;

public class WhileLoop2 {
    //print only even numbers between 1-20
    public static void main(String args[])
    {
        int a=1;
        System.out.println("Start of Loop !!");
        while(a<=20){
            if(a%2==0)
                System.out.println("Even = "+a);
            //else
            //System.out.println("Odd = "+a);

            a++;
        }
        System.out.println("End of Loop !!");
    }
}
