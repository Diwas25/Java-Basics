package LanguageFundamentals.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraylistDemo2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<String> names = new ArrayList<>(20);
        names.add("Nitin");
        names.add("Dinesh");
        names.add("Rahul");
        names.add("Ravi");
        names.add("Neeraj");

        //System.out.println(names);
        LinkedList<String> l = new LinkedList<String>();
        l.add("Orange");
        l.add("Apple");
        l.add("Peach");
        l.add("Guava");
        l.add("Pear");

        List<String> aList = new ArrayList<String>(l);
        System.out.println("The ArrayList elements are: ");
        for (Object i : aList) {
            System.out.println(i);
        }
    }
}
