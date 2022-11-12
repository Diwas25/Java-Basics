package OOPsConcepts.Polymorphism;

class Person{
    public void showDetails(){
        System.out.println("Basic Details of a Person");
    }
}
class Employee extends Person{
    public void showDetails(){
        System.out.println("Basic Details of a Employee");
    }
}
class Manager extends Person{
    public void showDetails(){
        System.out.println("Basic Details of a Manager");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Person person = new Person();
        Person person = new Employee();
        Person person2 = new Manager();
        person.showDetails();
        person2.showDetails();
    }
}
