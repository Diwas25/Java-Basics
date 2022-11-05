package LanguageFundamentals.VariablesAndDatatypes;

import java.util.Arrays;

public class CharExample2 {

    public static void main(String[] args) {

        String str="Elephant";
        //int arr[] = [10,23,30,50];
        char[] ch=str.toCharArray();

        System.out.println("String: "+str);
        System.out.println("char: "+ Arrays.toString(ch));

    }

}
