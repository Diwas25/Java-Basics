package DesignPatterns.ProxyPattern;

public class Main {
    public static void main(String[] args) {
        Library library = new ProxyLibrary();
        library.borrowBook("Alice","Rich Dad Poor Dad");
        library.borrowBook("Nomi","Atomic Habits");
        library.borrowBook("Mark","Think and grow rich");
    }
}
