package CommonPractices.InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Sequential stream
        long sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println("Sequential sum: " + sum);

        // Parallel stream
        long parallelSum = numbers.parallelStream().reduce(0, Integer::sum);
        System.out.println("Parallel sum: " + parallelSum);
    }
}

