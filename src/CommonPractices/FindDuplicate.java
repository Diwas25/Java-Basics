package CommonPractices;

import java.util.HashSet;

public class FindDuplicate {
    public static boolean checkDuplicate(int arr[]){
        HashSet<Integer> uniqueValues = new HashSet<>();
        for(int a : arr)
        {
            if(uniqueValues.contains(a)){
                return true;
            }
            uniqueValues.add(a);

        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,2,3,4,6};

        if(checkDuplicate(arr)){
            System.out.println("We have duplicate number are inside the array");
        } else{
            System.out.println("We have unique number are inside the array");
        }

    }
}
