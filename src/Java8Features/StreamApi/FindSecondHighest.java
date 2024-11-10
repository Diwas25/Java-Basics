package Java8Features.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondHighest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,3,6,20,5);
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumbers.get(sortedNumbers.size()-2));
    }
}
