package CommonPractices;

public class WideningAndTypeCasting {
    public static void main(String[] args) {
        int a = 12;
        float b = a;// casting by keys-variable (widening)
        System.out.println(a);
        System.out.println(b);

        float f = 10.5f;
        int d = (int)f;// casting by values(type casting)
        System.out.println(f);
        System.out.println(d);
    }
}
