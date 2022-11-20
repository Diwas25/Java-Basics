import java.util.Arrays;
import java.util.List;

public class SumStreamDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = integers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
