package LanguageFundamentals.FunctionAndString;

import java.util.Scanner;

public class FunctionDemo2 {
    static void wishMeByName(String pname){ //parameterized method
        System.out.println("Hi, how are you "+pname);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String pname = sc.next();

        wishMeByName(pname);
    }
}
