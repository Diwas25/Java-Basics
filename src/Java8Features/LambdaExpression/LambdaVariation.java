package Java8Features.LambdaExpression;

interface Intref1{
    void printName(String sname);
}

interface Intref2{
    void printNameAndAge(String sname,String age);
}

interface calculateAdd{
    void add(int a, int b);
}
public class LambdaVariation {
    public static void main(String[] args) {
        Intref1 a1 = sname ->System.out.println("Name : "+sname);
        a1.printName("Rohan");

        Intref2 a2 = (sname,age) -> System.out.println("Name : "+sname+" ,Age : "+age);
        a2.printNameAndAge("Dinash","25");

        calculateAdd cadd = (a,b) -> System.out.println("Addition is : "+(a+b));
        cadd.add(23,11);
    }
}
