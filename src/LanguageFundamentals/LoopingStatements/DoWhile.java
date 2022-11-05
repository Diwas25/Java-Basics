package LanguageFundamentals.LoopingStatements;

public class DoWhile{
    //printing even numbers using do-while loop
    public static void main(String args[]){
        int i = 1;
        do {
            if(i%2==0)
                System.out.println("Even = "+i);
            i++;
        }
        while (i < 10);
    }
}
