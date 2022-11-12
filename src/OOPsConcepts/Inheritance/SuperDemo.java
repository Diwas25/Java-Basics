package OOPsConcepts.Inheritance;

class ParentA{
    int age;
}
class ChildA extends ParentA{
    int age;

    ChildA(int a,int b){
        super.age = a;
        age = b;
    }
    public void showAges() {
        System.out.println("Parent Age is = "+super.age+" and Child age is = "+age);
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        ChildA child = new ChildA(75,45);
        child.showAges();
    }
}
