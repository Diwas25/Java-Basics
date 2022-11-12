package LanguageFundamentals.SimpleProgramsPart1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        String str;
        int i;
        float f;
        double d;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please Enter a String");
        str = br.readLine();

        System.out.println("Please Enter a Integer");
        i = Integer.parseInt(br.readLine());

        System.out.println("Please Enter a Float");
        f = Float.parseFloat(br.readLine());

        System.out.println("Please Enter a Double");
        d = Double.parseDouble(br.readLine());

        System.out.println("String = "+str+" Integer = "+i+" Float = "+f+"f Double = "+d);
    }
}
