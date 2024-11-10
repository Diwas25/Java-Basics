package CommonPractices;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondLargestAndSmallest {
    public static int getSecondLargest(int ar[]){
        int secondLargest = Arrays.stream(ar).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst()
                .orElseThrow(()->new IllegalStateException("Array doesn't have second largest element"));
        return secondLargest;
    }
    public static int getSecondSmallest(int ar[]){
        int secondLargest = Arrays.stream(ar).distinct().sorted().skip(1).findFirst()
                .orElseThrow(()->new IllegalStateException("Array doesn't have second largest element"));
        return secondLargest;
    }
    public static List<Integer> getCommonElement(int ar1[], int ar2[]){
        List<Integer> commonElements = Arrays.stream(ar1).distinct()
                .filter(num -> Arrays.stream(ar2).anyMatch(ar2Num->ar2Num==num))
                .boxed().collect(Collectors.toList());
        return commonElements;

    }

    public static void main(String[] args) {
        int arr1[] = {2,45,7,4,8,9,2};
        int arr2[] = {13,16,45,2,5,4};
        System.out.println("Second Largest = "+getSecondLargest(arr1));
        System.out.println("Second Smallest = "+getSecondSmallest(arr1));

        System.out.println("Common Elements = "+getCommonElement(arr1,arr2));
    }
}
