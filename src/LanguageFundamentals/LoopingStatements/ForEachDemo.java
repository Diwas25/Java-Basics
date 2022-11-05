package LanguageFundamentals.LoopingStatements;

public class ForEachDemo{
    public static void main(String args[])
    {
        //iteration using Integer
        int a[] = {10,30,45,65,7,34,67,12,11}; //size of array - 9
        for(int x : a){
            System.out.println(x);
        }

        //iteration using String
        String flower_names[] = {"Lily","Lotus","Rose","Butterfly"};
        for(String flower_name : flower_names){
            System.out.println(flower_name);
        }
    }
}
