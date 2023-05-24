package CommonPractices.InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondLargestElement {
    public static void findByJava8(Integer arr[]){
        System.out.println("Given Array : "+Arrays.toString(arr));
        Integer second_large = Arrays.stream(arr).distinct()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("Second largest Elements : "+second_large);
    }

    public static void findByJava8Type2(int arr2[]){
        System.out.println("Given Array : "+Arrays.toString(arr2));
        int secondLargest = Arrays.stream(arr2)
                .boxed()
                .sorted((a, b) -> b.compareTo(a))
                .distinct()
                .skip(1)
                .findFirst()
                .orElse(-1);
        System.out.println("Second largest Elements : "+secondLargest);
    }
    public static void main(String[] args) {
        Integer arr[] = {2,45,23,37,99,12};
        findByJava8(arr);

        int[] arr2 = {10, 20, 30, 40, 50};
        findByJava8Type2(arr2);
    }
}
