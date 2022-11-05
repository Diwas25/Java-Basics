package Mutlithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i = 0; i < 10; i++){
            Runnable runnable = new MyRunable("Worker Thread"+i);
            executorService.execute(runnable);
        }

        executorService.shutdown();
        while(executorService.isTerminated()) {
        }
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("All requests completed successfully");
    }
}
