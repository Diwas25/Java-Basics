package OOPsConcepts.Inheritance;

class Animal1{
    void eat(){System.out.println("eating...");}
}
class Dog1 extends Animal1{
    void bark(){System.out.println("barking...");}
}
class TestInheritance{
    public static void main(String args[]){
        Dog1 d=new Dog1();
        d.bark();
        d.eat();
    }
}
