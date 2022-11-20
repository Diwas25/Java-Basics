package CommonPractices.InterviewQuestions;

interface PrintMsg{
    public String print(String msg);
}
public class InterfacePrintDemo implements PrintMsg {
    public String print(String msg){
        return "Interface is printing "+msg;
    }
    public static void main(String[] args) {
        InterfacePrintDemo id = new InterfacePrintDemo();
        System.out.println(id.print("Hello"));
        System.out.println(id.print("Good Morning"));
    }
}
