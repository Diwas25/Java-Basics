package CommonPractices.InterviewQuestions;

import java.util.Arrays;

public class SortingArray {
    public static int[] method1(int[] nums){
        Arrays.sort(nums);
        return nums;
    }
    public static int[] method2(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int temp=0;
                if(nums[i]>nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int numbers[] = {1,5,2,65,33,74,90};
        int num1[] = method1(numbers);
        int num2[] = method2(numbers);
        System.out.println("Sorting using sort() - "+Arrays.toString(num1));
        System.out.println("Sorting using sort algorithm - "+Arrays.toString(num2));
    }
}
