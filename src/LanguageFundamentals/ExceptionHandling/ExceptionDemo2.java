package LanguageFundamentals.ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionDemo2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Enter Your Name");
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            String str="";
            str = br.readLine();
            System.out.println("Welcome "+str+"!");
        }
    }
}

