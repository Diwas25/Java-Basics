package Java11Features;

import java.util.function.BiFunction;

public class VarDemo {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> add = (var a, var b) -> a + b;
        System.out.println(add.apply(3,8));
    }
}
