package LanguageFundamentals.InputClasses.Scanner;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble();
        double t = sc.nextDouble();
        double r = sc.nextDouble();

        //double p = 1700;
        //double t = 2;
        //double r = 12.5;
        double si;
        si = (p*t*r)/100;
        System.out.println("Principle = "+p);
        System.out.println("Time(in Yrs) = "+t);
        System.out.println("Rate = "+r);
        System.out.println("Simple Interest = "+si);
    }
}
