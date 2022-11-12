package LanguageFundamentals.SimpleProgramsPart2;

public class VarArgMethod {
    static void vaTest(String str, int ...v) {
        System.out.print(str+" : Number of args: "+v.length+" Contents: ");
        for(int x:v) {
            System.out.print(x+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		int n1[] = { 10 };
//		int n2[] = { 1,2,3 };
//		int n3[] = {};

        vaTest("Single Argument",10);
        vaTest("Multiple Argument",1,2,3);
        vaTest("No Argument");
    }
}
