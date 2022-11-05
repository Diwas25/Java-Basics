package LanguageFundamentals.ConditionalStatements;

public class IfDemo{
    public static void main(String args[]){
        //int a = 23;
        //if(a == 10)
        //	System.out.println("Value of A is 10");
        //	System.out.println("Middle of Program!!!");
        //
        //System.out.println("End of Program!!!");
        //find the number is positive or negaive
        int a = 45;
        if(a<0){
            System.out.println(a+" is a negative Number");
            return; //it will stop the program
            //System.out.println("Unreachable Code"); //it will give unreachable error
        }
        System.out.println(a+" is a positive Number");
    }
}
