package CommonPractices;


import java.util.*;

public class TwoSum {
    public int[] twosm(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<numbers.length;i++) {
            if(map.containsKey(target-numbers[i])) {
                result[1]=i;
                result[0]=map.get(target-numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
    public static void main(String args[]) {
        TwoSum twosum = new TwoSum();
        int[] arr = {2,12,9,4,1,7,8};
        int target = 9;
        int[] arr2=twosum.twosm(arr, target);
        System.out.println(Arrays.toString(arr2));
    }
}

