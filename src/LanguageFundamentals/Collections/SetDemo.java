package LanguageFundamentals.Collections;

import java.util.EnumSet;
import java.util.Set;

enum Gfg { CODE, LEARN, CONTRIBUTE, QUIZ, MCQ }
public class SetDemo {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Set<Gfg> set1;
        set1 = EnumSet.of(Gfg.QUIZ, Gfg.CONTRIBUTE,
                Gfg.LEARN, Gfg.CODE);
        System.out.println("Set 1: " + set1);
    }
}
