package CommonPractices.InterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class CustomParallelStreamExample {
    public static void main(String[] args) {
        // Sample list of numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Create a custom ForkJoinPool with a specific number of threads
        ForkJoinPool customThreadPool = new ForkJoinPool(4); // Number of threads: 4

        // Use the custom ForkJoinPool with parallel stream
        customThreadPool.submit(() -> {
            numbers.parallelStream()
                    .forEach(number -> {
                        System.out.println("Processing number " + number + " on thread " + Thread.currentThread().getName());
                        // Add your processing logic here
                    });
        }).join();

        // Shutdown the custom ForkJoinPool
        customThreadPool.shutdown();
    }
}

