package OOPsConcepts.Polymorphism;

class Student{
    public void read(){
        System.out.println("Student is reading XYZ book");
    }
    public void read(String bookname){
        System.out.println("Student is reading "+bookname+" book");
    }
}
public class OverloadingDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student stu = new Student();
        stu.read();
        stu.read("Thinking in Java");
    }

}
