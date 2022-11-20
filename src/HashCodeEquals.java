

//the contract between HashCode and Equals is:
//1)if two objects are equal they must have same hashcode
//2)if two objects have same hashcode, they may or may not be equal


import java.util.HashSet;
import java.util.Set;

class Pen{
    int price;
    String color;
    public Pen(int price, String color) {
        this.price = price;
        this.color = color;
    }
    @Override
    public boolean equals(Object obj){
        Pen that=(Pen)obj;
        boolean isEqual = this.price == that.price && this.color.equals(that.color);
        return isEqual;
    }
    @Override
    public int hashCode(){
        return price + color.hashCode();
    }
}
public class HashCodeEquals {
    public static void main(String[] args) {

        Pen p1 = new Pen(20,"Blue");
        Pen p2 = new Pen(20,"Blue");

        System.out.println(p1) ;
        System.out.println(p2) ;
        System.out.println(p1.equals(p2)) ;

        Set<Pen> pens = new HashSet<>();
        pens.add(p1);
        pens.add(p2);
        System.out.println(pens) ;
    }
}
