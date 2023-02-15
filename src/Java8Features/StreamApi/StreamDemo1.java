package Java8Features.StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {

        //Map Demo
        List<Integer> numbers = Arrays.asList(2,3,4,5);
        Function<Integer,Integer> square = x -> x * x;
        Function<Integer,Integer> addbyfive = x -> x + 5;

        List<Integer> squares = numbers.stream().map(square).collect(Collectors.toList());
        System.out.println(squares);

        List<Integer> addfive = numbers.stream().map(addbyfive).collect(Collectors.toList());
        System.out.println(addfive);
        numbers.stream().map(addbyfive).forEach(System.out::println);

        //Filter Demo
        List<Integer> numbers2 = Arrays.asList(10,20,30,40,50);
        Predicate<Integer> printMoreThanTwenty = x-> x > 20;
        List<Integer> result = numbers2.stream().filter(printMoreThanTwenty).collect(Collectors.toList());
        System.out.println(result);

        //Sorted Demo
        List<String> names = Arrays.asList("Vinita","Abhay","Dinesh","Umesh");
        List<String> sortResult = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortResult);

        List<Integer> unsortednums = Arrays.asList(34,11,56,21,89,106);
        List<Integer> sortednums = unsortednums.stream().sorted().collect(Collectors.toList());
        System.out.println(sortednums);
    }
}
