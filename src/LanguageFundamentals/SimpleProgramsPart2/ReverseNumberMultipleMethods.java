package LanguageFundamentals.SimpleProgramsPart2;

import java.util.Scanner;

public class ReverseNumberMultipleMethods {
    //method for reverse a number
    public static void reverseNumberRecursion(int number) {
        if (number < 10) {
            //prints the same number if the number is less than 10
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            reverseNumberRecursion(number / 10);
        }
    }

    public static void reverseNumberForLoop(int number) {
        int reverse = 0;
        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println(reverse);
    }

    public static void reverseNumberWhile(int num) {
        int reversed = 0;
        while(num != 0) {

            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }
        System.out.println(reversed);
    }

    public static void main(String args[]) {
        System.out.print("Enter the number that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("The reverse of the given number is: ");
        //method calling
        reverseNumberRecursion(num);
        System.out.print("The reverse of the given number is: ");
        reverseNumberForLoop(num);
        System.out.print("The reverse of the given number is: ");
        reverseNumberWhile(num);
    }
}
