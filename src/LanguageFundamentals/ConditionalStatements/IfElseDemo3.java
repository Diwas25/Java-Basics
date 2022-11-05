package LanguageFundamentals.ConditionalStatements;

import java.util.Scanner;

public class IfElseDemo3{
    public static void main(String args[]){
        System.out.println("Press 1: To Order Breakfast");
        System.out.println("Press 2: To Order Brunch");
        System.out.println("Press 3: To Order Lunch");
        System.out.println("Press 4: To Order Sancks");
        System.out.println("Press 5: To Order Dinner");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a==1) {
            System.out.println("Please give your Breakfast order");
        }
        else if(a==2) {
            System.out.println("Please give your Brunch order");
        }
        else if(a==3) {
            System.out.println("Please give your Lunch order");
        }
        else if(a==4) {
            System.out.println("Please give your Snacks order");
        }
        else if(a==5) {
            System.out.println("Please give your Dinner order");
        }
        else {
            System.out.println("Please give a Valid option(1-5)");
        }

    }
}
