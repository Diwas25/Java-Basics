package CommonPractices.InterviewQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String fname;
    int age;
    public Person() {
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public Person(String fname, int age) {
        this.fname = fname;

        this.age = age;
    }
    @Override
    public String toString() {
        return fname + " " + age;
    }
}

public class SortEmployeeName {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("tarun", 28));
        persons.add(new Person("arun", 29));
        persons.add(new Person("varun", 12));
        persons.add(new Person("aruna", 22));

        persons.stream().sorted(Comparator.comparing(Person::getFname).thenComparing(Person::getAge))
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}

