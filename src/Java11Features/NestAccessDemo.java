package Java11Features;

public class NestAccessDemo {
    private String outerField = "Hello from OuterClass";
    class InnerClass {
        private String innerField = "Hello from InnerClass";

        void showOuterField() {
            System.out.println(outerField);  // Accesses private field of OuterClass
        }
    }
    void showInnerField() {
        InnerClass inner = new InnerClass();
        System.out.println(inner.innerField);  // Accesses private field of InnerClass
    }
    public static void main(String[] args) {
        NestAccessDemo OuterAccessDemo = new NestAccessDemo();
        OuterAccessDemo.new InnerClass().showOuterField();
        OuterAccessDemo.showInnerField();
    }
}
