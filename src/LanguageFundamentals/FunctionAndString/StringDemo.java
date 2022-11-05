package LanguageFundamentals.FunctionAndString;

public class StringDemo{
    public static void main(String args[]){
        //why String is immtable in Java
        String str = "Java";
        String str1 = new String("Python");
        System.out.println("My favorite language is "+str1);

        int r = str.length();
        System.out.println("Length of str is "+r);

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("Please"));

        //special character
        String txt2 = "We are the so-called\n \"Vikings\" from the north.";
        System.out.println(txt2);


    }
}
