package LanguageFundamentals.ConditionalStatements;

public class NestedIf{
    //Program to find person is eligible for pension or not
    //task - make it using Scanner
    public static void main(String args[]){
        String nationality = "Indian";
        int age = 77;

        if (nationality=="Indian") {
            System.out.println("You are Indian");
            if (age>=60) {
                System.out.println("And You are eligible for pension");
            }
            else{
                System.out.println("And You are not eligible for pension");
            }
        }
        else{
            System.out.println("Sorry, you are not Indian");
        }
    }
}
