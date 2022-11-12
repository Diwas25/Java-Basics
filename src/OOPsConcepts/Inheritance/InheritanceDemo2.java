package OOPsConcepts.Inheritance;

class Pen{
    String color;
    String type;
    int price;
}
class Gelpen extends Pen{
    String name;
    String model;

    void display() {
        System.out.println(color+" "+type+" "+price+" "+name+" "+model);
    }
}
class Ballpen extends Pen{
    String name;
    String model;
    void display() {
        System.out.println(color+" "+type+" "+price+" "+name+" "+model);
    }
}

public class InheritanceDemo2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Gelpen ocean = new Gelpen();
        ocean.color = "blue";
        ocean.type = "Gel";
        ocean.price = 20;
        ocean.name = "Ocean Blue";
        ocean.model = "C7";

        ocean.display();

        //task - do the same with Ballpen class

        Ballpen ballpen = new Ballpen();
        ballpen.color = "blue";
        ballpen.type = "Ball";
        ballpen.price = 15;
        ballpen.name = "Jetter";
        ballpen.model = "J20";

        ballpen.display();
    }
}
