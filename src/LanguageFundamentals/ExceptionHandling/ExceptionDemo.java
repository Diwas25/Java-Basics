package LanguageFundamentals.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i,j=1,k=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        i=8;
        try{
            System.out.println("Input a Number");
            j=Integer.parseInt(br.readLine());
            k=i/j;
        }
        catch(IOException e){
            System.out.println("Wrong input");
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide by zero");
        }
        System.out.println(k);
    }
}
