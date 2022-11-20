package CommonPractices.InterviewQuestions;

import java.util.Scanner;

public class SortArray{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.print("Program to Sort the array element:");
        System.out.println("\n----------------------------------\n");
        Scanner s = new Scanner(System.in);// creating object to input class
        System.out.print("Enter no. of elements you want in array:");// prompts to enter the size
        int n = s.nextInt();
        int a[] = new int[n];// Declaring the array name
        int b[] = new int[n];// To print at last;
        int temp = 0;// temporary variable used in swapping;
        System.out.println("Enter all the elements:");// prompts to enter the array element
        //Loop to get array elements
        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();// get the array element and store to array
            b[i] = a[i];// assigned to b[i] for printing purpose
        }

        for (int i = 0; i < n; i++) //To take one element
        {
            for (int j = i + 1; j < n; j++) // compare the element that have been taken in a[i]
            {
                if (a[i] > a[j]) //To Swap if element compared is greater than other element
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("**********************************");
        System.out.println("Sorted element in Ascending order:");
        System.out.println("**********************************");
        System.out.println("Original input provided:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(b[i] + " ");
        }
        System.out.println("\nSorted output:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }

}
