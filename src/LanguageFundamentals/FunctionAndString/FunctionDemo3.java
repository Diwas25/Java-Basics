package LanguageFundamentals.FunctionAndString;

public class FunctionDemo3 {
    void wishMeByName(String pname){
        System.out.println("Hi, how are you "+pname);
    }
    void wishMorning(String pname){
        System.out.println("Hi, Good Morning! "+pname);
    }

    int doAddition(int a, int b){
        return a+b;
    }

    public static void main(String args[]){
        FunctionDemo3 func3 = new FunctionDemo3();
        func3.wishMeByName("Shankar");
        func3.wishMeByName("Rahul");
        func3.wishMeByName("Neeraj");
        func3.wishMorning("Ravi");

        //calling a method having return type
        System.out.println("Addition is "+func3.doAddition(5,9));

    }
}
