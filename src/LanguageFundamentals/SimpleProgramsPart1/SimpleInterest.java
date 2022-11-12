package LanguageFundamentals.SimpleProgramsPart1;

public class SimpleInterest{

    public static void main(String args[]){
        double p=1700;
        double t=2;
        double r=12.5;
        double si;

        si = (p*t*r)/100;
        System.out.println("Principle is "+p);
        System.out.println("Time(in years) is "+t);
        System.out.println("Rate is "+r);
        System.out.println("Simple Interest is "+si);

    }
}
