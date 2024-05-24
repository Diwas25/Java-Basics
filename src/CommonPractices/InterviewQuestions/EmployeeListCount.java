package CommonPractices.InterviewQuestions;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeListCount {
    public static void main(String[] args) {
        // Sample list of employee names
        List<String> employeeList = new ArrayList<>();
        employeeList.add("Sunil");
        employeeList.add("Anil");
        employeeList.add("Sunil");
        employeeList.add("John");
        employeeList.add("Anil");
        employeeList.add("Sunil");

        // Count occurrences using Java Stream API
        Map<String, Long> nameOccurrences = employeeList.stream()
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        // Print names and their occurrences
        //nameOccurrences.forEach((name, count) -> System.out.println(name + " - " + count));

        System.out.println(nameOccurrences);
    }
}

