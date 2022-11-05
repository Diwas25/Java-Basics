package LanguageFundamentals.ConditionalStatements;

public class SwitchDemo2{

    public static void main(String args[]){
        int expression = 3;
        // switch statement to check size
        switch (expression) {
            case 1:
                System.out.println("Case 1");
                break;
            // matching case
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }
}
