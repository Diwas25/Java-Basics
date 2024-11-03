package CommonPractices.InterviewQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamConcurrentModificationExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // Removing an element from the list using streams
        list = list.stream()
                .filter(s -> !s.equals("B"))
                .collect(Collectors.toList()); // This will not throw ConcurrentModificationException

        System.out.println("Modified list: " + list);
    }
}
