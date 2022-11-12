package LanguageFundamentals.SimpleProgramsPart1;

import java.util.Scanner;

public class PrintTable{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to print a Table");
        int num = sc.nextInt();
        System.out.println("=================Table Start=============");

        for(int i=1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+(num*i));
        }
        System.out.println("=================Table End=============");
    }
}
