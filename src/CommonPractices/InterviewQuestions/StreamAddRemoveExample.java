package CommonPractices.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAddRemoveExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Add an element to the list using streams
        List<String> newListWithAddition = new ArrayList<>(list); // Create a new list based on the original list
        newListWithAddition.add("D"); // Add new element

        System.out.println("List with addition:");
        System.out.println(newListWithAddition);

        // Remove an element from the list using streams
        List<String> newListWithRemoval = list.stream()
                .filter(e -> !e.equals("B")) // Remove element "B"
                .collect(Collectors.toList());

        System.out.println("List with removal:");
        System.out.println(newListWithRemoval);
    }
}



