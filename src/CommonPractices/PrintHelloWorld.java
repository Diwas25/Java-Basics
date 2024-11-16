package CommonPractices;

@FunctionalInterface
interface Myfunctional {
    void print();
}
public class PrintHelloWorld {
    public static void main(String[] args) {
        Myfunctional myfunctional = () -> System.out.println("Hello World!!");
        myfunctional.print();
    }
}
