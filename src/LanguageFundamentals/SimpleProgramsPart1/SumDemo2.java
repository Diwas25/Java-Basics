package LanguageFundamentals.SimpleProgramsPart1;

import java.util.Scanner;

public class SumDemo2{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
        //arr[0] = sc.nextInt();
        //arr[1] = sc.nextInt();

        for(int a=0; a<5;a++){
            arr[a] = sc.nextInt();
        }
        int sum = 0;
        for(int s : arr){
            //System.out.println("Array value"+s);
            sum = sum + s;
        }
        System.out.println("the given number Sum = "+sum);
    }
}
