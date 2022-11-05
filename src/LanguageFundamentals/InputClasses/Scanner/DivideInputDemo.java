package LanguageFundamentals.InputClasses.Scanner;

import java.util.Scanner;

public class DivideInputDemo{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Num1");
        double a = sc.nextDouble();
        System.out.println("Enter the value of Num2");
        double b = sc.nextDouble();
        double c = a/b;
        double d = a%b;

        System.out.println("Num1 = "+a);
        System.out.println("Num2 = "+b);
        System.out.println("Quotient = "+c);
        System.out.println("Remainder = "+d);


    }
}
