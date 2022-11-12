package LanguageFundamentals.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CollegeStudent{
    String name;
    int rollno;
    String fav_subject;

    public CollegeStudent(String name, int rollno, String fav_subject) {
        this.name = name;
        this.rollno = rollno;
        this.fav_subject = fav_subject;
    }

    @Override
    public String toString() {
        return "CollegeStudent [name=" + name + ", rollno=" + rollno + ", fav_subject=" + fav_subject + "]";
    }
}
class SortByRollno implements Comparator<CollegeStudent>{

    @Override
    public int compare(CollegeStudent o1, CollegeStudent o2) {

        return o1.rollno - o2.rollno;
    }
}

class SortByFavSubject implements Comparator<CollegeStudent> {

    @Override
    public int compare(CollegeStudent o1, CollegeStudent o2) {

        return o1.fav_subject.compareTo(o2.fav_subject);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<CollegeStudent> cs = new ArrayList<CollegeStudent>();
        cs.add(new CollegeStudent("Rajan",23,"Java"));
        cs.add(new CollegeStudent("Suresh",12,"Oracle DB"));
        cs.add(new CollegeStudent("Ramesh",20,"Python"));
        cs.add(new CollegeStudent("Ganesh",6,"JavaScript"));

        //System.out.println(cs);
        Collections.sort(cs,new SortByRollno());

        System.out.println("----------------sort by roll no---------------");
        for(CollegeStudent colstu : cs) {
            System.out.println(colstu);
        }

        Collections.sort(cs,new SortByFavSubject());

        System.out.println("----------------sort by favourite subject---------------");
        for(CollegeStudent colstu : cs) {
            System.out.println(colstu);
        }
    }
}
