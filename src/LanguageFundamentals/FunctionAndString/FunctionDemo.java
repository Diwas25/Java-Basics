package LanguageFundamentals.FunctionAndString;

public class FunctionDemo {
    static void wishMe(){ //non-parameterized method
        System.out.println("Good Morning!");
    }
    static void wishMeByName(String pname){ //parameterized method
        System.out.println("Good Morning! "+pname);
    }
    public static void main(String args[]){
        int a = 144;
        int b = (int)Math.sqrt(a); //use predefined function
        int c = 12;
        System.out.println(b);
        System.out.println((int)Math.pow(c, 2));

        wishMe();
        wishMeByName("Rahul");

    }
}
