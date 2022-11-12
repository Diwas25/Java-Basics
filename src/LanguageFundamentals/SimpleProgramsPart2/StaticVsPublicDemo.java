package LanguageFundamentals.SimpleProgramsPart2;

public class StaticVsPublicDemo {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would output an error

        StaticVsPublicDemo myObj = new StaticVsPublicDemo(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method
    }
}
