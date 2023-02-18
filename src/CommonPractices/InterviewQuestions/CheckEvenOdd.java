package CommonPractices.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckEvenOdd {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(11,2,6,5,45,23,15,89);
        //numbers.stream().map(x -> x%2==0?"Even":"Odd").forEach(System.out::println);
        List<String> evenodd= numbers.stream().map(x -> x%2==0?"Even":"Odd").collect(Collectors.toList());
        System.out.println(evenodd);
    }
}
