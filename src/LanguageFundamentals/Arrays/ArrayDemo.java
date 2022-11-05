package LanguageFundamentals.Arrays;

public class ArrayDemo{
    public static void main(String args[]){
        int num = 12;
        //task - make array of double and string
        int nums[] = {12,45,67,98,11,34,21,12};
        //Array size - 8
        int size = nums.length;//count the size of array
        System.out.println(size);

        //getting the elements in array
        int g = nums[2];
        System.out.println(g);
        //67-12
        int h = nums[2]-nums[0];
        System.out.println(h);

        //changing the value in array
        nums[1] = 42;
        //{12,42,67,98,11,34,21,12};
        for(int r : nums){
            System.out.println(r);
        }

    }
}
