package Java8Features.LambdaExpression;

interface Sayable{
    public String say();
}
public class LambdaExpressionNoParameter {
    public static void main(String[] args) {
        Sayable s=()->{
            return "I have nothing to say.";
        };
        System.out.println(s.say());
    }
}
