package LanguageFundamentals.SimpleProgramsPart2;

class Box{
    double height;
    double width;
    double depth;

    Box(double h,double w,double d){
        height = h;
        width = w;
        depth = d;
    }

    void volume() {
        System.out.print("Volume is ");
        System.out.println(height*width*depth);
    }
}
public class BoxDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		Box box1 = new Box();//default constructor
//		box1.depth = 15;
//		box1.height = 20;
//		box1.width = 10;
//		box1.volume();

        Box box2 = new Box(20,10,15);// create such type of constructor
        box2.volume();
    }
}
