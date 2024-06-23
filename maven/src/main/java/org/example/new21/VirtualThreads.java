package org.example.new21;

import java.time.Duration;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

// https://openjdk.org/jeps/444

/**
 * This class demonstrates the usage of Java Virtual Threads (JEP 444).
 * It creates an ExecutorService that uses a new virtual thread for each task.
 * The tasks simulate some work with Thread.sleep() and print their completion status.
 */
public class VirtualThreads {

    /**
     * The main method of the VirtualThreads class.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Create an ExecutorService that uses a new virtual thread for each task
        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            // Submit 10,000 tasks to the executor
            IntStream.range(0, 10_000).forEach(i -> {
                executor.submit(() -> {
                    // Simulate some work with Thread.sleep()
                    Thread.sleep(Duration.ofSeconds(1));
                    // Print the completion status of the task
                    System.out.println(STR."Task \{i} completed by \{Thread.currentThread().getName()}");
                    return i;
                });
            });
            // Wait for all tasks to complete
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            // Handle the InterruptedException
            e.printStackTrace();
        }
    }
}
