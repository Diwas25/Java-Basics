package LanguageFundamentals.ExceptionHandling;

class MainException extends Exception {
    String message;
    MainException(String str) {
        message = str;
    }
    public String toString() {
        return ("Custom Exception Occurred : " + message);
    }
}
public class CustomException {
    public static void main(String args[]) {
        try {
            throw new MainException("This is a custom message");
        } catch(MainException e) {
            System.out.println(e);
        }
    }
}
