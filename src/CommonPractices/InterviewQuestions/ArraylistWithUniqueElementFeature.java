package CommonPractices.InterviewQuestions;

import java.util.ArrayList;

public class ArraylistWithUniqueElementFeature extends ArrayList {
    @Override
    public boolean add(Object o) {
        if(this.contains(o)){
            return false;
        }else{
            return super.add(o);
        }

    }

    public static void main(String[] args) {
        ArraylistWithUniqueElementFeature list = new ArraylistWithUniqueElementFeature();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(2);
        System.out.println(list);
    }
}
