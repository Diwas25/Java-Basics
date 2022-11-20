package LanguageFundamentals.InnerClasses;

//Java Program to Illustrate Anonymous Inner classes
//Declaration Without any Name
//As a subclass of the specified type

//Class 1
//Helper class
class Demo {

    // Method of helper class
    void show()
    {
        // Print statement
        System.out.println(
                "i am in show method of super class");
    }
}

//Class 2
//Main class
public class InnerClassDemo {

    // An anonymous class with Demo as base class
    static Demo d = new Demo() {
        // Method 1
        // show() method
        void show()
        {
            // Calling method show() via super keyword
            // which refers to parent class
            super.show();

            // Print statement
            System.out.println("i am in AnonymousInner class");
        }
    };

    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
        // Calling show() method inside main() method
        d.show();

    }
}