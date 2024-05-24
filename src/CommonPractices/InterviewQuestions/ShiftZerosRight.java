package CommonPractices.InterviewQuestions;

import java.util.Arrays;

public class ShiftZerosRight {
    public static void main(String[] args) {
        int arr[] = {23,0,45,0,0,67,0,2,3};
        int nonZeroElement = 0;
        for(int a=0;a<arr.length;a++){
            if(arr[a]!=0){
                int temp = arr[a];
                arr[a]=arr[nonZeroElement];
                arr[nonZeroElement] = temp;
                nonZeroElement++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
