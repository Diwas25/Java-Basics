package LanguageFundamentals.SimpleProgramsPart1;

import java.util.Scanner;

public class InputMathDemo{
    public static void main(String args[]){
        //int a = 4;
        //System.out.println("Number "+a+" Square root "+Math.sqrt(a));

        //coverting dollor into rupees
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values in Dollor you want to convert in rupees");
        int dollor = sc.nextInt();
        int rupee = dollor*75;

        System.out.println(dollor+" Dollor = "+rupee+" Rupees");
    }
}
