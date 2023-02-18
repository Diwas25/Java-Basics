package CommonPractices.InterviewQuestions;

@FunctionalInterface
interface PrintMessage{
    void sayHello();
}

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        PrintMessage pm = () -> System.out.println("Hello Everyone");
        pm.sayHello();
    }
}
