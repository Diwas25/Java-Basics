package LanguageFundamentals.SimpleProgramsPart2;

import java.util.Scanner;

class Country{
    Scanner country = new Scanner(System.in);
    String countryname;
    void display1() {
        System.out.println("Enter your country");
        countryname = country.nextLine();
    }
}
class States extends Country{
    Scanner state = new Scanner(System.in);
    String statename;
    void display2() {
        System.out.println("Enter your States");
        statename = state.nextLine();
    }
}
class City extends States{
    Scanner city = new Scanner(System.in);
    String cityname;
    void display3() {
        System.out.println("Enter your City");
        cityname = city.nextLine();
    }
    void showDetails() {
        System.out.println("Entered Country Name : "+countryname);
        System.out.println("Entered State Name : "+statename);
        System.out.println("Entered City Name : "+cityname);
    }
}

public class InheritanceAndInput{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        City cd = new City();
        cd.display1();
        cd.display2();
        cd.display3();
        cd.showDetails();

    }
}
