package LanguageFundamentals.SimpleProgramsPart2;

import java.util.Arrays;

public class ReturnArrayNobject {
    int a;
    ReturnArrayNobject(){
        //blank constructor
    }

    //parameterized constructor
    ReturnArrayNobject(int i){
        a = i;
    }

    //Method for returning an Object
    ReturnArrayNobject incrByTwo() {
        ReturnArrayNobject ran2 = new ReturnArrayNobject(a+2);
        return ran2;
    }

    //Method for returning an Array
    int[] returnArray(int n) {

        int arr[] = new int[10];

        for(int i=1; i<=arr.length;i++)
        {
            arr[i-1] = i*n;
        }
        return arr;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ReturnArrayNobject ran = new ReturnArrayNobject();
        System.out.println(Arrays.toString(ran.returnArray(5)));
        System.out.println(Arrays.toString(ran.returnArray(20)));


        ReturnArrayNobject ran2 = new ReturnArrayNobject(100);
        ReturnArrayNobject ran3;
        ran3 = ran2.incrByTwo();
        System.out.println(ran3.a);
    }

}
