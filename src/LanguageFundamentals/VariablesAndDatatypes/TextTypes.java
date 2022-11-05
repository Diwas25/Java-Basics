package LanguageFundamentals.VariablesAndDatatypes;

public class TextTypes{

    public static void main(String args[]){

        String boyName = "Ram";
        System.out.println("Hello, "+boyName+" How are you?");

        char c='A';
        System.out.println("Character value is "+(c+12));
        int b = 65;
        char g = (char)b;//type-casting

        System.out.println(g+" is Character is of int "+b);

    }

}
