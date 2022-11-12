package OOPsConcepts.Inheritance;

class Animal{
    String name;
    public void eat() {
        System.out.println("I can eat");
    }
}
class Dog extends Animal {

    // new method in subclass
    public void display() {
        System.out.println("My name is " + name);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Dog labrador = new Dog();

        // access field of superclass
        labrador.name = "Tommy";
        labrador.display();

        // call method of superclass
        // using object of subclass
        labrador.eat();
    }
}
