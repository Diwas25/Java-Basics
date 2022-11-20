package LanguageFundamentals.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Nitin");
        names.add("Dinesh");
        names.add("Rahul");
        names.add("Ravi");
        names.add("Neeraj");

        names.set(1, "Diwakar");
        //names.remove(0);
        //names.clear();
        System.out.println(names.indexOf("Ravi"));
        System.out.println(names);
//		System.out.println(names.size());
//		System.out.println(names.get(0));
        Collections.sort(names);
        for (String i : names) {
            System.out.println(i);
        }
    }
}
