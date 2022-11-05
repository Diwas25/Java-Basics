package LanguageFundamentals.InputClasses.Scanner;

import java.util.Scanner;

public class IfElseDemo{
    //task - use Scanner class to take user input
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name ");
        String name = sc.next();
        System.out.println("Enter your Age ");
        int age = sc.nextInt();
        //find the Eligible to vote

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
