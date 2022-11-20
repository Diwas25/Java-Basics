package LanguageFundamentals.Generics;

class Container<T>{
    T value;
    public void show(){
        System.out.println(value.getClass().getName());
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        Container<Integer> obj = new Container<>();
        obj.value=17;
        obj.show();
        //type safe
        //always use wrapper class for generics types
//		List<Integer> values1 = new ArrayList<Integer>();
        //values1.add("Singh");
//		values1.add(125);

        //no type safe
        //by default its type is Object type
//		List values = new ArrayList();
//		values.add("Singh");
//		values.add(125);
//
//		int i = Integer.parseInt(values.get(0).toString());
//		System.out.println(i);
    }
}
