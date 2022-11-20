package LanguageFundamentals.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");

        // Use addFirst() to add the item to the beginning
        cars.addFirst("Mazda");
        cars.add("Mercides");
        System.out.println(cars);

        Iterator itr = cars.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("=============================");
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
