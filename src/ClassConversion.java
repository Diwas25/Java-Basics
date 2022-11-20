class A{
    int product_price;
    void Print(){
        System.out.println("Coming from A");
    }
}
class B extends A{
    void Print(){
        System.out.println("Coming from B");
    }
}

public class ClassConversion {
    public static void main(String[] args) {
        A a = new B();
        a.Print();

//		A a = new B();
//		B b = new B();
        //C c = (C)b;

//		byte x = 127;
//		byte y = 127;
        //b = a + b; // error : cannot convert from int to byte
//		y += x; // ok
//		System.out.println(y);
//
    }
}
