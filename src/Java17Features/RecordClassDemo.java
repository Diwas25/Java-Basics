package Java17Features;

import java.util.Objects;

//class NitEmployee{
//    int id;
//    String name;
//
//    public NitEmployee(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return "NitEmployee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        NitEmployee that = (NitEmployee) o;
//        return id == that.id && Objects.equals(name, that.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
//}

record NitEmployee(int id,String name){
    NitEmployee(){
        this(0,"");
    }
}
public class RecordClassDemo {
    public static void main(String[] args) {
        NitEmployee ne1 = new NitEmployee(1,"Dev Kumar");
        NitEmployee ne2 = new NitEmployee(1,"Dev Kumar");
        NitEmployee ne3 = new NitEmployee();
        System.out.println(ne1);
        System.out.println(ne1.equals(ne2));

        System.out.println(ne1.name());
    }
}
