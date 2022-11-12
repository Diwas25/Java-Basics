package LanguageFundamentals.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
//	@Override
//	public int compareTo(Student st) {
//		// TODO Auto-generated method stub
//		if(rollno==st.rollno)
//			return 0;
//		else if(rollno>st.rollno)
//			return 1;
//		else
//			return -1;
//	}

    @Override
    public int compareTo(Student st) {
        // TODO Auto-generated method stub
        return name.compareTo(st.name);
    }
}

public class CamparableDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        //System.out.print(al);
        Collections.sort(al);

        for(Student st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }

}
