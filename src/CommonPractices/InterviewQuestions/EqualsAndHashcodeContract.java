package CommonPractices.InterviewQuestions;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class CollegeStudent{
    private int id;
    private String name;

    public CollegeStudent(int id, String name) {
        this.id = id;
        this.name = name;
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
    public String toString() {
        return "CollegeStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollegeStudent that = (CollegeStudent) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class EqualsAndHashcodeContract {
    public static void main(String[] args) {
        Set<CollegeStudent> cs = new HashSet<>();
        cs.add(new CollegeStudent(1,"Diwas"));
        cs.add(new CollegeStudent(1,"Diwas"));
        cs.add(new CollegeStudent(2,"Ram"));

        System.out.println(cs);
    }
}
