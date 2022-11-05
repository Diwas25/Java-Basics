package LanguageFundamentals.ConditionalStatements;

public class IfElseDemo2{
    //task - use Scanner class to take user input
    public static void main(String args[]){
        //find the Eligible to vote
        int age = 11;
        String name="Suresh";
        //System.out.println("Program Start !!!");
        if(age<18){
            System.out.println(name+" Cannot Vote");
        }
        else{
            System.out.println(name+" Can Vote");
        }
        //System.out.println("Program End !!!");
    }
}
