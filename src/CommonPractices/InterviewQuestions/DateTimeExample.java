package CommonPractices.InterviewQuestions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();
        System.out.println("LocalDateTime: " + now);

        // Define a custom date and time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Format and print the current date and time
        String formattedDateTime = now.format(formatter);
        System.out.println("Java Date and Time: " + formattedDateTime);
    }
}

