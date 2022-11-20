package LanguageFundamentals.InnerClasses;

//Java Program to Illustrate Static Nested Classes


//Class 1
//Outer class
class Outer2 {
    // Method
    private static void outerMethod()
    {
        // Print statement
        System.out.println("inside outerMethod");
    }

    // Class 2
    // Static inner class
    static class Inner {
        public static void display()
        {
            // Print statement
            System.out.println("inside inner class Method");
            // Calling method inside main() method
            outerMethod();
        }
    }
}

//Class 3
//Main class
class StaticNested {
    // Main driver method
    public static void main(String args[])
    {
        Outer2.Inner obj = new Outer2.Inner();
        // Calling method via above instance created
        obj.display();
    }
}
