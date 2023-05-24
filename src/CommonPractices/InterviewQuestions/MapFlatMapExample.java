package CommonPractices.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapExample {

    public static void main(String[] args) {
        // Using map
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = list1.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println(list2); // Output: [2, 4, 6, 8]

        // Using flatMap
        List<List<Integer>> list3 = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4), Arrays.asList(5, 6));
        List<Integer> list4 = list3.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
        System.out.println(list4); // Output: [1, 2, 3, 4, 5, 6]
    }
}

