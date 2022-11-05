package LanguageFundamentals.LoopingStatements;

public class KeywordBreakDemo {
    public static void main(String args[]){
        for(int a=0;a<10;a++){
            if(a==4){
                //break;
                continue;
            }
            else if(a==6){
                //break;
                continue;
            }
            System.out.println("Value = "+a);
        }
        System.out.println("=====================================");
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                //break;
                continue;
            }
        }
    }
}
