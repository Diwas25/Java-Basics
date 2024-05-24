package InterviewProblems;

import java.util.Arrays;

public class SecondHighest {
    public static void main(String[] args) {
//        int[] arr = {11, 4, 3, 8, 11, 4, 11, 9};
//
//        int firstMax = Integer.MIN_VALUE;
//        int secondMax = Integer.MIN_VALUE;
//
//        for (int num : arr) {
//            if (num > firstMax) {
//                secondMax = firstMax;
//                firstMax = num;
//            } else if (num > secondMax && num < firstMax) {
//                secondMax = num;
//            }
//        }
//
//        System.out.println("Second highest number: " + secondMax);
        int[] arr = {11, 4, 3, 8, 11, 4, 11, 9};

        int secondMax = Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted((a, b) -> b - a)
                .limit(2)
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Array has less than two distinct elements."));

        System.out.println("Second highest number: " + secondMax);
    }
}

