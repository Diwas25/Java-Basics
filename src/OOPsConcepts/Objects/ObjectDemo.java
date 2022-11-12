package OOPsConcepts.Objects;


class Mobile{
    //properties
    String name;
    String color;
    String screen;
    int price;
    //methods
    void call(){
        System.out.println("we can call through "+name+" mobile");
    };
}

public class ObjectDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int r;
        //System.out.println(r);
        Mobile mobile1 = new Mobile();
        mobile1.name = "Sumsung Galaxy C5";
        mobile1.color = "Black";
        mobile1.screen = "large";
        mobile1.price = 12000;

        Mobile mobile2 = new Mobile();
        mobile2.name = "Realme";
        mobile2.color = "white";
        mobile2.screen = "medium";
        mobile2.price = 6000;

        System.out.println(mobile1.name);
        System.out.println(mobile1.color);
        System.out.println(mobile1.screen);
        System.out.println(mobile1.price);
        mobile1.call();
        System.out.println("======================================");
        System.out.println(mobile2.name);
        System.out.println(mobile2.color);
        System.out.println(mobile2.screen);
        System.out.println(mobile2.price);
        mobile2.call();

    }

}

