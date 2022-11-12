package LanguageFundamentals.SimpleProgramsPart1;

import java.util.Scanner;

public class SayHello{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String pname = sc.next();
        System.out.println("Hi Good Morning "+pname);
    }
}
