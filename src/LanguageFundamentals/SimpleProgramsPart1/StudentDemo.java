package LanguageFundamentals.SimpleProgramsPart1;

public class StudentDemo {

    public static void main(String[] args) {
        int[] roll_num = {1,2,3,4,5,6,7};
        int[] sclass={11,9,12,10,8,5,2};
        String[] section={"a","b","c","d","e","f","g"};
        String[] dop={"31-2-1996","21-4-1995","4-5-1995","15-4-1996","31-12-1994" ,"21-5-1998","25-1-1990"};
        String[] name = {"Nupur sharma","Rakesh","Umesh","Ravi kumar","Kailash","Maya","Rashmi"};

        if((roll_num.length == sclass.length) && (roll_num.length == section.length)
                && (roll_num.length == dop.length) && (roll_num.length == name.length)) {
            for(int i=0;i<roll_num.length;i++) {
                System.out.println("Class:"+sclass[i]);
                System.out.println("roll Number: "+roll_num[i]);
                System.out.println("Date of birth:" +dop[i]);
                System.out.println("Section:"+section[i]);
                System.out.println("Student Name: "+name[i]);

                System.out.println("===================================");
            }
        }
        else {
            System.out.println("Something is wrong");
        }
    }

}
