package LanguageFundamentals.Recursion;

public class RecursionDemo3{
    static int factorial(int n)
    {
        if (n == 0) //basecase
            return 1;

        return n * factorial(n - 1);
    }
    //5 * factorial(4)
    //4 * factorial(3)
    //3 * factorial(2)
    //2 * factorial(1)
    //1 * factorial(0)

    //which is answer 120
    //5 * 24
    //4 * 6
    //3 * 2
    //2 * 1
    //1 * 1
    public static void main(String[] args)
    {
        int num = 5;
        System.out.println("Factorial of " + num
                + " is " + factorial(5));
    }
}
