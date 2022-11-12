package LanguageFundamentals.SimpleProgramsPart2;

import java.util.HashSet;
import java.util.Objects;

class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        return id == other.id && Objects.equals(name, other.name);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) return false;
//        if (!(obj instanceof Student))
//            return false;
//        if (obj == this)
//            return true;
//        return this.getId() == ((Student) obj).getId();
//    }
//
//    @Override
//    public int hashCode() {
//        return id;
//    }

}
public class EqualAndHashCodeContract {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student alex1 = new Student(1, "Alex");
        Student alex2 = new Student(1, "Alex");

        System.out.println("alex1 hashcode = " + alex1.hashCode());
        System.out.println("alex2 hashcode = " + alex2.hashCode());
        System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));

        HashSet<Student> students = new HashSet<Student> ();
        students.add(alex1);
        students.add(alex2);

        System.out.println("==============================================");

        System.out.println("HashSet size = " + students.size());
        System.out.println("HashSet contains Alex = " + students.contains(new Student(1, "Alex")));


    }

}

