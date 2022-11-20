package LanguageFundamentals.InnerClasses;

class OuterClass {
    // Simple nested InnerClass class
    class InnerClass {
        // show() method of InnerClass class
        public void show()
        {
            // Print statement
            System.out.println("In a nested class method");
        }
    }
}

public class NestedInner {
    public static void main(String[] args) {
        OuterClass.InnerClass in = new OuterClass().new InnerClass();
        in.show();
    }
}
