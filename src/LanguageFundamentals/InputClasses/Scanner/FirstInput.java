package LanguageFundamentals.InputClasses.Scanner;

import java.util.Scanner;

public class FirstInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input num1");
        int a=sc.nextInt(); //nextDouble()
        System.out.println("Please input num2");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Input num1 = "+a);
        System.out.println("Input num2 = "+b);

        System.out.println("Addition Result = "+c);


    }
}
