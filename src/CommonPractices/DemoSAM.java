package CommonPractices;

import java.util.function.Function;

public class DemoSAM {

    public static void main(String[] args) {
        Runnable rh = () -> {
            System.out.println("Run Method");
        };

        new Thread(rh).start();

        //Demo of some predefined functional interfaces
        Function<Integer,String> function1 = (a) -> "FI - Function started! "+a;
        System.out.println(function1.apply(34));

    }
}
