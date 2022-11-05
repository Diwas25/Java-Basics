package LanguageFundamentals.Arrays;

public class ArrayDemo2 {
    public static void main(String args[])
    {
        //static declaration
        int c[] = new int[5];
        c[4] = 23;
        int d = c.length;
        System.out.println(d);
        System.out.println("Array value of index 4th "+c[4]);
        System.out.println("Array value of index 2nd "+c[2]);
        int e[] = new int[5];
        e[0] = 23;
        e[1] = 65;
        e[2] = 63;
        e[3] = 21;
        e[4] = 12;
        for(int f : e){
            System.out.println("Array value = "+f);
        }
        //dynamic declaration
        int a[] = {23,45,11,23,56,23,45,12};
        int b = a.length;
        System.out.println(b);
        for(int g : a){
            System.out.println("Array value = "+g);
        }
    }
}
