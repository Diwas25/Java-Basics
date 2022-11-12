package LanguageFundamentals.StarPatterns;

public class StarPattern1 {

    static void pattern1() {
        for(int i=0;i<5;i++) {

            for(int j=i+1;j<=5;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int row) {
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        pattern1(); //reverse star pattern
       // pattern2(5);//star pattern
    }

}
