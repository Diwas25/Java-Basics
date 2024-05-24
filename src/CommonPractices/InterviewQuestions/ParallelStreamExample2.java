package CommonPractices.InterviewQuestions;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample2 {
    public static void main(String[] args) {
        // Sample list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Sequential stream example
        System.out.println("Sequential Stream:");
        numbers.stream()
                .map(ParallelStreamExample2::processNumber)
                .forEach(System.out::println);

        // Parallel stream example
        System.out.println("\nParallel Stream:");
        numbers.parallelStream()
                .map(ParallelStreamExample2::processNumber)
                .forEach(System.out::println);
    }

    // Sample method to simulate processing a number
    private static String processNumber(int number) {
        try {
            // Simulate some processing time
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Processed: " + number;
    }
}


